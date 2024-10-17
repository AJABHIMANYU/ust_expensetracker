FROM openjdk:17-oracle
COPY ./target/expsense-tracker-0.0.1-SNAPSHOT.jar expsense-tracker.jar
CMD ["java","-jar","expsense-tracker.jar"]