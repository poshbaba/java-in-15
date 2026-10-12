# Day 25 challenge — Introduction to Maven

Change the application summary to include QA and three replicas, then run mvn clean package and the packaged program.

## Acceptance criteria

The build succeeds under JDK 21 and java -cp target/lesson-1.0-SNAPSHOT.jar Main prints the updated summary.

## Starting point

Copy the entire [demo folder](../demo) to a separate working folder before editing. Keep its fixtures and POM if supplied. Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

Run from that working folder:

```sh
mvn clean package
java -cp target/lesson-1.0-SNAPSHOT.jar Main
```

[Reference solution](../solution) · [Back to lesson](../README.md)
