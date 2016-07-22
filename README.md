Yaktor DSL
============

Introduction
------------
This project contains the Yaktor DSLs created by SciSpike to support various projects with clients.

Copyright
---------
This code is the property of SciSpike LLC. Any use of this software must be approved by SciSpike LLC.


To build:
---------
Make sure you are using Java 1.7 and also ensure that you have sufficent memory.
Try this:

npm run mvn

To Release a New Version to the Eclipse Update Site:
---------
To upload a new version (ie 1.0.0).

>> ATTENTION
requires [aws cli](http://docs.aws.amazon.com/cli/latest/userguide/installing.html#install-bundle-other-os) 

```
npm install
composite/site.js --sites 0.2.0,1.0.0 # include all sites you wish to make available
composite/upload.sh
```

Make sure that you have credendial in `~/.aws/credentials` like:

```
[scispike]
aws_access_key_id = xxxxxxxxxxxxxx
aws_secret_access_key = yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
```



