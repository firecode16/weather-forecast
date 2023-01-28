FROM java:8

LABEL maintainer="hfredi35@gmail.com"

VOLUME /tmp

EXPOSE 8082

ADD $PWD/deployments/weather-forecast-service/target/weather-forecast-0.0.1.jar weather-forecast-service.jar

RUN bash -c 'touch /weather-forecast-service.jar'

ENV JAVA_OPTS=""

# Run the jar file
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /weather-forecast-service.jar"]