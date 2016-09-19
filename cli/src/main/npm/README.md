# yaktor-lang

[![master status](https://img.shields.io/travis/SciSpike/yaktor-dsl-xtext/master.svg?maxAge=3600)](https://travis-ci.org/SciSpike/yaktor-dsl-xtext)
[![Maven Central](https://img.shields.io/maven-central/v/io.yaktor/xtext-dsl-cli.svg?maxAge=3600)](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22xtext-dsl-cli%22)
[![license](https://img.shields.io/github/license/SciSpike/yaktor-dsl-xtext.svg?maxAge=3600)](https://github.com/SciSpike/yaktor-dsl-xtext/blob/master/LICENSE)
[![Gitter](https://img.shields.io/gitter/room/SciSpike/yaktor.svg?maxAge=3600)](https://gitter.im/SciSpike/yaktor)
[![npm](https://img.shields.io/npm/v/yaktor-lang.svg?maxAge=3600)](https://www.npmjs.com/package/yaktor-lang)
[![Coveralls status](https://img.shields.io/coveralls/SciSpike/yaktor-dsl-xtext/master.svg?maxAge=2592000)](https://coveralls.io/github/SciSpike/yaktor-dsl-xtext?branch=master)

Generate Node.js code from Yaktor Domain and Conversation DSL files.

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
where `files` is a whitespace-delimited list of Yaktor Conversation (`*.cl`) and Domain Model (`*.dm`) files.

> NOTE: Run the above command from the root of your Yaktor project.

A common invocation is

```bash
find . -name '*.dm' -o -name '*.cl'| xargs yaktor-lang
```

## For Yaktor Developers

The following is information for those working on Yaktor itself (or the curious).

### Version Correspondence Between This npm Module and the Maven Artifact

We use [semver](http://semver.org/).

For generally available releases (not prereleases), the version correspondence between this npm module and the Maven artifact version is one-to-one.

For example, `yaktor-lang@1.0.0` will include Maven artifact `io.yaktor:xtext-dsl-cli:1.0.0` (`xtext-dsl-cli-1.0.0.jar`), `yaktor-lang@1.0.1` will contain `xtext-dsl-cli-1.0.1.jar`, and so on.
If you ever need to, you can find the executable jar in [Maven Central](http://repo1.maven.org/maven2/io/yaktor/xtext-dsl-cli/), but, remember, it's included in the root of this npm module itself.

Prerelease versions of this npm module are signifed by a `-pre.YYYYmmddHHMMSS` version suffix. However, in the Maven world of [yaktor-dsl-xtext](https://github.com/SciSpike/yaktor-dsl-xtext),
prereleases are signifed by a `-SNAPSHOT` suffix.
The actual Maven executable jar file corresponding to a given prerelease can be found at the [Maven Snapshot Repository](https://oss.sonatype.org/content/repositories/snapshots/io/yaktor/xtext-dsl-cli/).

For example, prerelease version `1.0.0-pre.20160725231748` of this npm module would contain Maven artifact `io.yaktor:yaktor-xtext-dsl-cli:1.0.0-SNAPSHOT` that was staged to Sonatype's Maven snapshot repository at `2016-07-25T23:17:48Z`, but is included in the npm module simply as `xtext-dsl-cli-1.0.0-SNAPSHOT.jar`.  All prerelease iteration numbers will map to `-SNAPSHOT` at a given staging second in UTC.

In order to find the jar in Maven, you'd need to browse to https://oss.sonatype.org/content/repositories/snapshots/io/yaktor/xtext-dsl-cli/1.0.0-SNAPSHOT, then look for a jar whose name is of the form
`xtext-dsl-cli-1.0.0-YYYYmmdd.HHMMSS-n.jar`, where the timestamp is *close to* `20160725.231748`, but may not be *exactly* the same
due to delays incurred when promoting the jar from Maven's staging area to production.
