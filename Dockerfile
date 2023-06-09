# Set the base image to OpenJDK 17
FROM openjdk:17-jdk-slim

# Copy contents from the target folder to the working dir
ADD ./ScientificCalculator/target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./

# Set the working directory to ./
WORKDIR ./

# Set the entry point to run the application
ENTRYPOINT ["java","-jar","/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]