FROM openjdk:8-jdk-alpine 
FROM ubuntu:latest

RUN apt-get update && \
      apt-get -y install sudo
RUN sudo apt-get update && \
     sudo apt-get install -y maven && \
     sudo apt-get install -y git

ARG CACHEBUST=1 

RUN git clone https://github.com/Vaibhavi1707/calculator.git
RUN cd calculator && mvn clean install
RUN pwd
RUN java -jar calculator/get/calculator-0.0.1-SNAPSHOT.jar
