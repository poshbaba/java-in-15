# Day 28 challenge — Unit Testing with JUnit

Add tests for healthy counts -1 and 11 with total ten; check zero and full health; reject NaN and 101 percent.

## Acceptance criteria

The demo runs three tests. The solution runs six, all passing; invalid inputs must throw rather than return a misleading percentage.

## Starting point

Copy the entire [demo folder](../demo) to a separate working folder before editing. Keep its fixtures and POM if supplied. Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

Run from that working folder:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

[Reference solution](../solution) · [Back to lesson](../README.md)
