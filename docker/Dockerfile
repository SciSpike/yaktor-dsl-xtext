FROM maven:3.2-jdk-7

RUN curl -sL https://deb.nodesource.com/setup_4.x | bash -
RUN apt-get install -y nodejs
RUN apt-get install -y awscli

VOLUME /build
WORKDIR /build
