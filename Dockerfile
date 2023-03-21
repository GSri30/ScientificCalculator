# Set the base image to OpenJDK 17
FROM adoptopenjdk:17-jdk-hotspot

# Copy contents from the target folder to the working dir
ADD ./ScientificCalculator/target/ScientificCalculator-1.0-SNAPSHOT.jar ./

# Set the working directory to ./
WORKDIR ./

# Set the entry point to run the application
ENTRYPOINT ["java","-jar","/ScientificCalculator-1.0-SNAPSHOT.jar"]