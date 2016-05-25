package io.yaktor.generator.nodejs

import io.yaktor.domain.AmountField
import io.yaktor.domain.AnyField
import io.yaktor.domain.BooleanField
import io.yaktor.domain.CountField
import io.yaktor.domain.DateField
import io.yaktor.domain.DomainModel
import io.yaktor.domain.Entity
import io.yaktor.domain.EntityReferenceField
import io.yaktor.domain.EnumField
import io.yaktor.domain.Field
import io.yaktor.domain.GeoLocationField
import io.yaktor.domain.IntegerField
import io.yaktor.domain.MongoNodeGenOptions
import io.yaktor.domain.NumericField
import io.yaktor.domain.PriceField
import io.yaktor.domain.StringField
import io.yaktor.domain.TableType
import io.yaktor.domain.TypeField
import java.util.ArrayList
import java.util.Collection
import org.eclipse.xtext.generator.IFileSystemAccess

import static extension io.yaktor.generator.nodejs.NodeJsExtensions.*

class NodeMochaTestGenerator {
	
	def generate(IFileSystemAccess fsa, DomainModel model) {
		var genOptions = model.genOptions as MongoNodeGenOptions
		var path = genOptions.testPath as CharSequence
		if (path == null) {
			path = ""
		}
		for (Entity e : model.types.filter(typeof(Entity)).sortBy[e|e.name]) {
			fsa.generateFile('''«path»test«e.name».js''', genTest(e))
		}
	}
	def CharSequence genTest(Entity e) {'''
		/**
		 * Generated!!!
		 * This is a simple CRUD test for the «e.name» document
		 * 
		 */
		var assert = require("assert");
		var mongoose = require("mongoose");
		var randexp = require("randexp").randexp;
		var «e.name» = require("../app/models/«e.name.toFirstLower»").«e.name»;
		
		/*
		 * Connect to the database
		 */
		var db = mongoose.connect('mongodb://localhost/«e.domainModel.name»UnitTest', function(err) {
		});
		
		/**
		 * Testing «e.name»
		 */
		describe('«e.name»', function() {
			/**
			 * Test of simple CRUD operations
			 */
			describe('«e.name» CRUD', function(done) {
				var objectId = null; // used to lookup/update/remove the object after creation
				
				/**
				 * Clear the collection prior to running
				 */
				before(function(done) {
					«e.name».remove(done(), function(err) {
					});
				});

				/*
				 * First... does the schema exist???
				 */
				it('loads', function() {
					assert(«e.name» !== null);
				});

				/*
				 * Create an object and insert it in the data
				 */
				it('create', function(done) {
					«e.name».create({
						«e.genFields»
					}, function(err, out) {
						if (!err) {
							objectId = out._id;
						}
						done(err);
					});
				});

				/*
				 * Find the object previously created
				 */
				it('find', function(done) {
					«e.name».findOne({
						_id : objectId
					}).exec(function(err, out) {
						done(err);
					});
				});

				/*
				 * Update the ubject previously created
				 */
				it('update', function(done) {
					«e.name».update({
						_id : objectId
					}, {
						«e.genOneUpdateAttribute»
					}, {
						multi : true
					}, function(err, numberAffected, raw) {
							done(err);
					});
				});

				/*
				 * Remove the object previously created
				 */
				it('remove', function(done) {
					«e.name».remove({
						_id : objectId
					}, done);
				});

				/**
				 * Clear the schema in case we run several tests
				 */
				it('cleanup', function(done) {
					«e.name».remove(function(err){
					done();
			    });
			});
				
			});
		});
		
	'''	
	}
	def CharSequence genFields(TableType tt) {
		var Collection<CharSequence> fieldDeclarations = new ArrayList<CharSequence>()
		for (f : tt.allFields.sortBy[f|f.name]) {
			if (f.required) {
				fieldDeclarations.add(f.genDeclaration)
			}
		}
//		if (tt instanceof Entity) {
//			var e = tt as Entity
//			fieldDeclarations.addAll(e.genLinkDefinitions)
//		}
		return '''
			«FOR f : fieldDeclarations SEPARATOR ','»
				«f»
			«ENDFOR»
		'''
//						userName : randexp(/[a-f0-9]{40}/),
//						password : "123",
//						preapprovalAmount : 60,
//						preapprovalKey : "123",
//						startDate : Date.now(),
//						nativeToken : "123",
//						dwollaToken : "123"
		
	}
	def String genOneUpdateAttribute(Entity e) {
//						userName : randexp(/[a-f0-9]{40}/)	
	}
		/**
	 * The abstract type
	 */
	def dispatch CharSequence genDef(Field f) {
	}
	
	def CharSequence genDeclaration(Field f) {
		if (f.many) {
			var count = 1+ (Math.random() * 10.0) as int
			var Collection<CharSequence> elements =  new ArrayList<CharSequence>(count) 
			for (i : 1..count) {
				elements.add(f.genDef)
			}
			return '''«f.name»: [«FOR e: elements SEPARATOR ','»«e»«ENDFOR»]'''
		}
		return '''«f.name»: «f.genDef»'''
	}

	/**
	 * Generate field for StringField
	 */
	def dispatch CharSequence genDef(StringField f) {
		if (f.maxLength>0 || f.minLength>0) {
			return '''randexp(/[a-f0-9A-Z]{«f.minLength»..«f.maxLength»}/)'''
		}
		else if (f.pattern != null) {
			return '''randexp(/«f.pattern»/'''
		}
		return '''randexp(/[a-f0-9]{40}/)'''
	}

	/**
	 * Generate field for BooleanField
	 */
	def dispatch CharSequence genDef(BooleanField f) {
		if (Math.random() > 0.5) {
			return "true"
		} 
		return "false"
	}
	
	/**
	 * Generate field for IntegerField
	 */
	def dispatch CharSequence genDef(IntegerField f) {
		var min = Integer.MIN_VALUE;
		var max = Integer.MAX_VALUE;
		if (f.minValue != null ) {
			min = Integer.parseInt(f.minValue);
		}
		if (f.maxValue != null) {
			max = Integer.parseInt(f.maxValue)
		}
		var value = (Math.random() * (max - min)) + min
		return Integer.toString(value as int)
	}
	
	/**
	 * Generate field for EnumField
	 */
	def dispatch CharSequence genDef(EnumField f) {'''
		randexp(/«FOR ef : f.isType.values SEPARATOR "|"»«ef.name»«ENDFOR»/)
	'''
	}

	/**
	 * Generate field for EntityReferenceField
	 */
	def dispatch CharSequence genDef(EntityReferenceField f) {
		return "" // TODO
	}
	
	/**
	 * Generate field for GeoLocationField
	 */
	def dispatch CharSequence genDef(GeoLocationField f) {
		return "[123.23, 123.23]" // TODO
	}

	/**
	 * Generate field for DateField
	 */
	def dispatch CharSequence genDef(DateField f) {
		return "Date.now()"
	}
	
	/**
	 * Generate field for NumericField
	 */
	def dispatch CharSequence genDef(NumericField f) {
		return "123.23" // TODO
	}
	
	/**
	 * Generate field for PriceField
	 */
	def dispatch CharSequence genDef(PriceField f) {
		return "123.23" // TODO
	}
	
	/**
	 * Generate field for Price Field
	 */
	def dispatch CharSequence genDef(AmountField f) {
		return "123.23" // TODO
	}
	
	/**
	 * Generate field for CountField
	 */
	def dispatch CharSequence genDef(CountField f) {
		return "123" // TODO
	}
	
	/**
	 * Generate field for Any Field
	 */
	def dispatch CharSequence genDef(AnyField f) {
		return "{}" // TODO
	}
	/**
	 * Generate field for Type Field
	 */
	def dispatch CharSequence genDef(TypeField f) {'''
		{
			«f.isType.genFields()»
		}'''
	}
	
}
