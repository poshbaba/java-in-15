# Day 27 challenge — Making HTTP Requests in Java

Change the request to /health?unhealthy=true and print a friendly response for status 503.

## Acceptance criteria

The demo prints Status: 200 and Body: healthy. The solution prints Status: 503 and Health endpoint unavailable. Both terminate cleanly.

## Starting point

Copy the entire [demo folder](../demo) to a separate working folder before editing. Keep its fixtures and POM if supplied. Java 21 JDK and the preceding lessons.

Run from that working folder:

```sh
javac Main.java DemoServer.java
java Main
```

[Reference solution](../solution) · [Back to lesson](../README.md)
