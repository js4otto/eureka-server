FROM openjdk:8-jdk-alpine
COPY target/PaymentDiscoveryService-0.0.1-SNAPSHOT.jar DiscoveryService.jar
ENTRYPOINT ["java","-jar","DiscoveryService.jar"]