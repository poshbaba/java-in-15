# Day 26 challenge — Working with JSON in Java

Add a positive integer replicas field to the supplied JSON and reject missing, fractional, or nonpositive replica values.

## Acceptance criteria

The valid fixture prints three replicas. Invalid field types fail with a clear error and nonzero exit.

## Starting point

Copy the entire [demo folder](../demo) to a separate working folder before editing. Keep its fixtures and POM if supplied. Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

Run from that working folder:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

[Reference solution](../solution) · [Back to lesson](../README.md)
