FROM gradle:7.4.1 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test

FROM amazoncorretto:17
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/pizzeria-0.0.1-SNAPSHOT.jar /app/pizzeria.jar

ENTRYPOINT ["java", "-jar","/app/pizzeria.jar"]