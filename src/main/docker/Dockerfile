# Docker has a simple Dockerfile file format that it uses to specify the "layers" of an image.
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD cas.jar app.jar
# Run the shell form
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
# Exec form Execute the shell directly
# First argument invokes the sh command, if the -c flag is present then commands are read from string ( the third argument )
# To reduce Tomcat startup time we added a system property pointing to "/dev/urandom" as a source of entropy.
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]