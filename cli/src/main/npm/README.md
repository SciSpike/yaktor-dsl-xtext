# yaktor-lang
Generate Node.js code from Yaktor Domain & Conversation DSL files.

## Description
`yaktor-lang` generates the default Node.js implementation for a [Yaktor](http://yaktor.io) project based on your Yaktor Conversation Language (`*.cl`) and Domain Model (`*.dm`) files.
The generated code can easily be extended and enhanced *without losing your changes*. Additionally, you can maintain documentation which adds tremendous value to your project.

> NOTE: this npm module requires `java` >= 1.7.0 (JRE, not the JDK).

Because this npm module is a thin wrapper around a Java command line executable jar built by [yaktor-dsl-xtext](https://github.com/SciSpike/yaktor-dsl-xtext), this npm module requires that `java` version `1.7.0` or later be on the machine's `PATH` where this module is run.

> NOTE: if you're using Yaktor's Docker image, you will have no need for Java on your own machine.

## Usage
```bash
yaktor-lang files ...
```
where `files` is a whitespace-delimited list of Yaktor Conversation Language (`*.cl`) and Domain Model (`*.dm`) files.

> NOTE: Run the above command from the root of your Yaktor project.

A common invocation is
```bash
find . -name '*.dm' -o -name '*.cl'| xargs yaktor-lang
```

## For Yaktor Developers
The following is information for those working on Yaktor itself (or the curious).

### Version Correspondence
We use [semver](http://semver.org/).

For generally available (GA) releases, the version correspondence between this npm module and the Maven artifact version is one-to-one.

For example, `yaktor-lang@1.0.0` will contain Maven artifact `io.yaktor:xtext-dsl-cli:1.0.0` (`xtext-dsl-cli-1.0.0.jar`), `yaktor-lang@1.0.1` will contain `xtext-dsl-cli-1.0.1.jar`, and so on.
If you ever need to, you can find the executable jar in [Maven Central](http://repo1.maven.org/maven2/io/yaktor/xtext-dsl-cli/), but, remember, it's included in the root of this npm module itself.

Prerelease versions of this npm module are signifed by a `-pre.YYYYmmddHHMMSS` version suffix. However, in the Maven world of [yaktor-dsl-xtext](https://github.com/SciSpike/yaktor-dsl-xtext),
prereleases are signifed by a `-SNAPSHOT` suffix.
The actual Maven executable jar file corresponding to a given prerelease can be found at the [Maven Snapshot Repository](https://oss.sonatype.org/content/repositories/snapshots/io/yaktor/xtext-dsl-cli/).

For example, prerelease version `1.0.0-pre.20160725231748` of this npm module would contain Maven artifact `io.yaktor:yaktor-xtext-dsl-cli:1.0.0-SNAPSHOT` that was staged to Sonatype's Maven snapshot repository at `2016-07-25T23:17:48Z`, but is included in the npm module simply as `xtext-dsl-cli-1.0.0-SNAPSHOT.jar`.  All prerelease iteration numbers will map to `-SNAPSHOT` at a given staging second in UTC.

In order to find the jar in Maven, you'd need to browse to https://oss.sonatype.org/content/repositories/snapshots/io/yaktor/xtext-dsl-cli/1.0.0-SNAPSHOT, then look for a jar whose name is of the form
`xtext-dsl-cli-1.0.0-YYYYmmdd.HHMMSS-n.jar`, where the timestamp is *close to* `20160725.231748`, but may not be *exactly* the same
due to delays incurred when promoting the jar from Maven's staging area to production.
