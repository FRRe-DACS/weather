FROM openjdk:8-jre-alpine

COPY --from=builder ./build/libs/weather-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java", "-jar", "app.jar"]

