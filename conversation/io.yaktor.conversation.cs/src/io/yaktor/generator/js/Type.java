/**
 * 
 */
package io.yaktor.generator.js;

/**
 * @author jkamke
 *
 */
public enum Type {
	string("string"), number("number"), integer("integer"), bool("boolean"), array(
			"array");
	Type(String name) {
		this.name = name;
	}

	public String name;
}
