FROM anapsix/alpine-java:jdk7

RUN wget -q -O - http://archive.apache.org/dist/maven/maven-3/3.2.5/binaries/apache-maven-3.2.5-bin.tar.gz | tar -xz
ENV PATH=/apache-maven-3.2.5/bin:$PATH

RUN apk --update add --no-cache \
    bash \
    g++ \
    git \
    make \
    nodejs-lts \
    python \
    sudo \
    gnupg \
    openssl

VOLUME /yaktor
VOLUME /build
WORKDIR /build
