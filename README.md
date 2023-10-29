# Sample-Java-Project-using-Maven
In the sec/main/java/Main.java we have a java program to caluclate mean,median and mode of a set of numbers and 
To fully grasp the details of how these calculations are implemented, you would need to review the actual Java source code within the Main.java file.

The provided pom.xml is an XML configuration file for a Maven project. It contains information about the project, its dependencies, and build settings.

In this configuration, the <mainClass> element specifies the name of the main class to be executed during the build process. In this case, it's set to "Main."
 <mainClass>Main</mainClass>

In summary, the pom.xml you provided is a basic Maven configuration file for a Java project. It defines project-related metadata, specifies Maven plugins for building and compiling code, and sets the configuration for the execution of a main Java class during the build process. The exact behavior and functionality of the Maven build depend on the specific plugins used and the details of your project's source code.

To run this Java program, you need the following software and tools installed on your computer:

- Java Development Kit (JDK)
- Apache Maven

- To run this program using java in cli you need to go to the file location and give commands as follows

- javac Main.java
- java Main

 To run this program using maven the commands are
- 
mvn clean

mvn compile

mvn exec:java
