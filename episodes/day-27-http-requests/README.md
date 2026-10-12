# Day 27 — Making HTTP Requests in Java

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Making HTTP Requests in Java in 15 Minutes | Day 27

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Build and send a GET request with HttpClient.
- Inspect status codes before using a response body.
- Set connection and request timeouts.
- Handle I/O failures and preserve interruption.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain URI, HttpClient, HttpRequest, HttpResponse, body handlers, timeouts, and try-with-resources |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

URI, HttpClient, HttpRequest, HttpResponse, body handlers, timeouts, and try-with-resources.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java DemoServer.java
java Main
```

**Supporting files:** [DemoServer.java](demo/DemoServer.java)

The supporting files are part of the runnable example; keep them with the supplied folder structure.

`DemoServer.java` is supplied infrastructure, not a server-building lesson. It binds only to 127.0.0.1, selects an available port, and shuts down after the request. No internet connection or API credentials are used. The solution keeps this fixture and changes only the requested path.

**Main.java**

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        try (DemoServer server = new DemoServer();
             HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(2)).build()) {
            HttpRequest request = HttpRequest.newBuilder(URI.create(server.baseUrl() + "/health"))
                    .timeout(Duration.ofSeconds(3)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Body: " + response.body());
            } else {
                System.out.println("Health endpoint unavailable");
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Health request interrupted");
            System.exit(1);
        } catch (IOException exception) {
            System.err.println("Health request failed: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Status: 200
Body: healthy
```

## Teaching notes

The supplied DemoServer is a fixture running only on loopback and choosing an available port. Its implementation is not part of the student task. A local fixture avoids depending on a changing public service. Explain that remote services can fail and HTTP 503 is a response, not an IOException.

**Common beginner mistake:** Treating every HTTP response as successful, omitting a timeout, or ignoring an InterruptedException.

## Student challenge

Change the request to /health?unhealthy=true and print a friendly response for status 503.

**Acceptance criteria:** The demo prints Status: 200 and Body: healthy. The solution prints Status: 503 and Health endpoint unavailable. Both terminate cleanly.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
public class Main {
    public static void main(String[] args) {
        try (DemoServer server = new DemoServer();
             HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(2)).build()) {
            HttpRequest request = HttpRequest.newBuilder(URI.create(server.baseUrl() + "/health?unhealthy=true"))
                    .timeout(Duration.ofSeconds(3)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Body: " + response.body());
            } else {
                System.out.println("Health endpoint unavailable");
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Health request interrupted");
            System.exit(1);
        } catch (IOException exception) {
            System.err.println("Health request failed: " + exception.getMessage());
            System.exit(1);
        }
    }
}
```

**Expected output**

```text
Status: 503
Health endpoint unavailable
```

**Solution supporting files:** [DemoServer.java](solution/DemoServer.java)

</details>

## Continuity

Day 26 parsed configuration. Day 27 requests a health endpoint; Day 28 verifies business rules with JUnit.

[Previous lesson](../day-26-json/README.md) · [Next lesson](../day-28-junit/README.md)
