# Java Deployment Manager — Day 30 capstone

[Course homepage](../../README.md) · [Day 30 walkthrough](../../episodes/day-30-deployment-manager/README.md)

A Java 21 command-line simulation combining application objects, collections, JSON configuration, enums, health policy, bounded retries, and tests. It does not deploy infrastructure.

## Run

Install a Java 21 JDK and Maven 3.9.x. From this project directory:

```sh
mvn clean test
mvn -q compile exec:java -Dexec.mainClass=Main
```

Choose application `1`, environment `2`, and maximum attempts `3`, each on its own line. booking-api at 95% health succeeds on its second simulated attempt. The UTF-8 `deployment-report.txt` records the decision and result.

## Check other paths

- Application 2: 85% health; review required; blocked before retries.
- Application 3: 75% health; rejected; blocked before retries.
- Application 1 with maximum attempts 1: exhausted retry; FAILED report and nonzero exit.
- Out-of-range, nonnumeric, or missing menu input: clear error and nonzero exit.
- Invalid JSON, duplicate names, nonpositive total replicas, or healthy counts greater than total: configuration error.

The report is replaced on each completed decision. Invalid inputs do not create a new report; an older report may remain. Inspect the console error before treating a report as the current run’s result.

## Configuration

Edit `config/applications.json`. Each object requires a nonblank unique name, positive integer totalReplicas, integer healthyReplicas between zero and total, and positive integer successAttempt. The chosen retry limit remains between one and five. A successAttempt greater than the limit deliberately simulates exhaustion.

The supplied seven tests cover health decisions, invalid state, retry termination, and configuration loading. The Day 30 lesson explains each source file and the challenge solution.
