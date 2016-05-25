package io.yaktor.generator.util

class RubyScripts {
	def genCompileAsciiDocScript() {'''
require 'rubygems'
require 'asciidoctor'
begin 
  require 'asciidoctor/cli'
rescue LoadError
end
require 'asciidoctor/cli/options'
require 'asciidoctor/cli/invoker'
require 'asciidoctor-diagram'
require 'fileutils'
require 'erb'

# Pick up the files
@afiles = { 
	'dms' => Dir.glob("**/domain/**/*.adoc"),
	'cs' => Dir.glob("**/conversation/*/reference.adoc"),
	'rest' => Dir.glob("**/conversation/*/rest/*/*.adoc")
}

## This is the Ascii doc template used for indexing
def indexTemplate()
	%{= Index

== Domain Models
<% @afiles['dms'].each do | f | %> 
* link:<%= f.sub('adoc', 'html') %>[<%= f.gsub(/^.*\\/([^\\/]*)\\/(.*).adoc$/,'\\1 \\2') %>]<% end %>

== Conversations
<% @afiles['cs'].each do | f | %> 
* link:<%= f.sub('adoc', 'html')  %>[<%= f.gsub(/^.*\\/([^\\/]*)\\/(.*).adoc$/,'\\1 \\2') %>]<% end %>

== Resources
<% @afiles['rest'].each do | f | %>
* link:<%= f.sub('adoc', 'html')  %>[<%= f.gsub(/^.*\\/rest(\\/.*).adoc$/,'\\1') %>]<% end %>
}
end

print "Produce index file...\n"
@renderer = ERB.new(indexTemplate())
File.open( 'index.adoc', 'w') { |file| file.write(@renderer.result()) }
print "... index file produced\n"

print "Compiling asciidoc files...\n"
Dir.glob("**/*.adoc") { 
	|file| 
	print "..." + file + "\n"
  arr = [
    "-a","docinfo1",
    "-a","stylesheet="+File.expand_path(File.dirname(__FILE__))+ "/css/riak.css",
    "-a","source-highlighter=prettify",
    "-a","toc2",
    "-a","idprefix=",
    "-a","idseparator=-",
    "-a","sectanchors",
    "-a","icons=font",
    "--trace",
    file ]
  Asciidoctor::Cli::Invoker.new(*arr).invoke!
}
	'''
	}
}
