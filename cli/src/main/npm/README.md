# yaktor-lang

Generate Node.js code from Domain & Conversation DSLs.  

## Description

Generate default implementation for a [Yaktor](https://github.com/Scispike/yaktor) project based on the `cl` and `dm` syntax.
The generated code can easily be extended and enhanced. As well you can maintain documentation which add value to the generated code. 



## Usage

It is a thin wrapper around the Java command line runnable jar built by [yaktor-dsl-xtext](https://github.com/SciSpike/yaktor-dsl-xtext), so this module requires that `java` version `1.7.0` or later be on the machine's path whereon this module is run.

```bash
yaktor-lang files ... 
```
Where files are `cl` and/or `dm` syntax files.

Run the above command from the root of your Yaktor project.  A common form of the command is to use `find`:

```bash
find . -name '*.dm' -o -name '*.cl'| xargs yaktor-lang
```

## For Yaktor developers

The following is information for those working on Yaktor itself.

### Version correspondence
[Semver](http://semver.org/) is used, and prerelease versions are signifed by a `-pre.YYYYmmddHHMMSS` suffix (using UTC). However, in the Maven world of [yaktor-dsl-xtext](https://github.com/SciSpike/yaktor-dsl-xtext),
prereleases are signifed by a `-SNAPSHOT` suffix.  So, for example, version `1.0.0-pre.20160725231748` of this module will contain Maven artifact `io.yaktor:yaktor-xtext-dsl-cli:1.0.0-SNAPSHOT` that was staged to Sonatype's Maven snapshot repository at `2016-07-25T23:17:48Z`, but is included here simply as `xtext-dsl-cli-1.0.0-SNAPSHOT.jar`.  All prerelease iteration numbers will map to `-SNAPSHOT` at a given UTC staging second.

For non-prerelease versions, the version correspondence is one-to-one:  `yaktor-lang@1.0.0` will contain Maven artifact `io.yaktor:xtext-dsl-cli:1.0.0` (`xtext-dsl-cli-1.0.0.jar`), `yaktor-lang@1.0.1` will contain `xtext-dsl-cli-1.0.1.jar`, and so on.

Essentially, the versions of this module and Maven artifact `io.yaktor:yaktor-dsl-text-cli` are linked; a change in one will force a change in the other.
