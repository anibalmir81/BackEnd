FROM amazoncorretto:18
MAINTAINER asm
COPY target/asm-0.0.1-SNAPSHOT.jar asm-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/asm-0.0.1-SNAPSHOT.jar"]