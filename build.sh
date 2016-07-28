docker run -it --rm \
    -v $PWD:/build \
    -e MAVEN_OPTS="-Xms256m -XX:MaxPermSize=1024m -Xmx1024m" \
    -e MAVEN_SETTINGS=cli/maven-deploy-settings.xml \
    -e CLI_DIR=cli \
    -v ~/.m2/:/root/.m2/ \
    yaktor-mvn-build $@