FROM openjdk:8 as builder

WORKDIR /weather
COPY . .

RUN ./gradlew clean build

FROM openjdk:8-jre-alpine

COPY --from=builder /weather/build/libs/weather-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE  8080

CMD ["java", "-jar", "app.jar"]