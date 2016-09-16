[![Yakor Logo](yaktor.io/pics/yaktor-logo.png)](https://github.com/Scispike/yaktor)

Yaktor DSLs created by SciSpike creating data models and behavior for your Yaktor Application

[![master status](https://img.shields.io/travis/SciSpike/yaktor-dsl-xtext/master.svg?maxAge=3600)](https://travis-ci.org/SciSpike/yaktor-dsl-xtext)
[![Maven Central](https://img.shields.io/maven-central/v/io.yaktor/xtext-dsl-cli.svg?maxAge=3600)](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22xtext-dsl-cli%22)
[![license](https://img.shields.io/github/license/SciSpike/yaktor-dsl-xtext.svg?maxAge=3600)](https://github.com/SciSpike/yaktor-dsl-xtext/blob/master/LICENSE)
[![Gitter](https://img.shields.io/gitter/room/SciSpike/yaktor.svg?maxAge=3600)](https://gitter.im/SciSpike/yaktor)
[![npm](https://img.shields.io/npm/v/yaktor-lang.svg?maxAge=3600)](https://www.npmjs.com/package/yaktor-lang)
[![Coveralls status](https://img.shields.io/coveralls/SciSpike/yaktor-dsl-xtext/master.svg?maxAge=2592000)](https://coveralls.io/github/SciSpike/yaktor-dsl-xtext?branch=master)

## Introduction

This is an Xtext-based project containing the Yaktor DSLs created by SciSpike, which includes
* the Yaktor DSL eclipse jars,
* the Yaktor DSL command line interface (CLI),
* the Yaktor DSL eclipse Plugin, and
* the `yaktor-lang` npm module.

## Building

There are two ways to build:  Docker (recommended) & natively.

### Building with Docker

```
$ docker build -t yaktor-mvn-build docker`
./build.sh mvn clean install
```

FTW

```
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

### Building natively

> NOTE: You are strongly encouraged to build via Docker; native building is unsupported.

To build from your native environment, ensure the following are installed.

* Maven 3.2 (*only* 3.2.x, for now)
* JDK 7 (JDK 8 has not yet been tested)
* Node 4.4.x & its associated `npm`
* A recent version of `git`
* A Unix-like build environment

Next, issue the following command:
```
$ MAVEN_OPTS='-Xms256m -XX:MaxPermSize=1024m -Xmx1024m' \
  mvn clean install -V
```
> TIP: If you have errors, they are most likely related to your environment.

## Releasing the Yaktor DSL CLI

> NOTE: This creates a new release that's published to the whole world.

### What Kind of Release?
We follow [semver](https://www.semver.org) release semantics.  Refer to them when deciding on which kind of release to perform.

There are three kinds of releases: minor, patch & prerelease.

> NOTE: procedurally, major releases are no different than minor releases; the only difference is that
the minor & patch versions are `0` (the full version is `n.0.0`, where `n` is an integer).  In order to prepare for a major release, you must
update the versions to `x.0.0-SNAPSHOT`, where `x` is the next major version.  You can do that with `./bump.sh premajor`.
Then, you perform a minor release as described below.

#### Minor (or Major) Release

In order to perform a major or minor release (`z.0.0` or `x.y.0`, respectively), do the following.
* Get the Yaktor source to your machine & note its absolute path; see section "Building" above.
* `git checkout master`
* `grunt release-minor`

The Grunt task `release-minor`
* builds & tests the multimodule Maven project,
* creates a maintenance branch,
* bumps all versions appropriately in `master` & the maintenance branches,
* creates all appropriate release tags,
* pushes everything to GitHub (which triggers a [Travis CI build](https://travis-ci.org/SciSpike/yaktor-dsl-xtext/builds)),
* publishes the Yaktor DSL CLI Java artifact to Maven Central, and
* publishes the Yaktor DSL npm module to npmjs.com.

The actual release is sourced from the [Travis CI build server](https://travis-ci.org/SciSpike/yaktor-dsl-xtext).
See https://github.com/SciSpike/yaktor-dsl-xtext/blob/master/.travis.yml for details.

#### Patch Release

In order to perform a patch release (x.y.z), do the following.
* Get the Yaktor source to your machine & note its absolute path; see section "Building" above.
* `git checkout` the maintenance branch.  Maintenance branches take the form `vi.j.x`, where `i` & `j` are integers and `x` is literal, like `v1.2.x`.
* `grunt release-patch`

The Grunt task `release-patch`
* builds & tests the multimodule Maven project,
* bumps all versions appropriately,
* creates all appropriate release tags in the maintenance branch,
* pushes everything to GitHub (which triggers a [Travis CI build](https://travis-ci.org/SciSpike/yaktor-dsl-xtext/builds)),
* publishes the Yaktor DSL CLI Java artifact to Maven Central, and
* publishes the Yaktor DSL npm module to npmjs.com.

The actual release is sourced from the [Travis CI build server](https://travis-ci.org/SciSpike/yaktor-dsl-xtext).
See https://github.com/SciSpike/yaktor-dsl-xtext/blob/master/.travis.yml for details.

#### Prerelease

> NOTE: Prereleases are performed manually! Read on.

Prereleases (or `SNAPSHOT`s, in Maven parlance) are automatically performed on pushes to the `master` branch or any maintenance branch (`vi.j.x`).
Builds are on [Travis CI](https://travis-ci.org/SciSpike/yaktor-dsl-xtext/builds).

If you need to publish a prerelease of the CLI npm module, you must do so **manually** after your *successful local build* by doing the following:
* `cd ./cli/target/npm`
* `npm login ...` (optional)
* `./npm-publish.sh`

> IMPORTANT: It's up to you to ensure that your local build is successful before publishing prereleases.
While it *is* a prerelease, you want to do your best to ensure that you're publishing properly built artifacts.
