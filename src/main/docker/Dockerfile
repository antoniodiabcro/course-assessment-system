# Docker has a simple Dockerfile file format that it uses to specify the "layers" of an image.
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD cas-jar-with-dependencies.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]