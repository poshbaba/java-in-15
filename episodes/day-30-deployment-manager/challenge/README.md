# Day 30 challenge — Build Your First Java Application — Deployment Manager

Extend the baseline with a validated maximum-attempts menu (1–5) and a UTF-8 deployment-report.txt recording application, environment, decision, and result for successful, blocked, and exhausted runs.

## Acceptance criteria

booking-api at QA with limit three succeeds on attempt two. payment-api is blocked for review and catalog-api is rejected without retries. Limit one exhausts booking-api and exits nonzero. Reports identify SUCCESS, BLOCKED, or FAILED accurately.

## Starting point

Copy the entire [demo folder](../demo) to a separate working folder before editing. Keep its fixtures and POM if supplied. Java 21 JDK and the preceding lessons. Install Apache Maven 3.9.x and confirm `mvn -version` reports Java 21. Run commands from the directory containing `pom.xml`; the first build needs internet access to resolve pinned dependencies.

Run from that working folder:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

For a successful run, choose application 1, environment 2, and maximum attempts 3. Also check application 2 and 3 are blocked, and limit 1 produces an exhausted retry.

[Reference solution](../solution) · [Back to lesson](../README.md)
