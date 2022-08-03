FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8083
ADD target/*.jar pensioner-disbursement-microservice.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /pensioner-disbursement-microservice.jar" ]