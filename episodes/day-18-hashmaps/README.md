# Day 18 — Java HashMaps

[Course homepage](../../README.md) · [Runnable demo](demo/Main.java) · [Challenge](challenge/README.md) · [Production guide](../../production/README.md)

**YouTube title:** Java HashMaps in 15 Minutes | Day 18

**Prerequisites:** Java 21 JDK and the preceding lessons.

## Learning objectives

- Store key-value pairs with generic types.
- Look up an environment by application name.
- Update and remove entries.
- Handle missing keys and explain map ordering.

## Detailed episode breakdown

| Segment | Target | Episode focus |
|---|---|---|
| Hook | 0:00–0:30 | Show the baseline output and the application behavior the learner will build. |
| Concept | 0:30–3:00 | Explain HashMap<String, String>, put/get/containsKey/remove/size and keys replacing an existing value |
| Coding demonstration | 3:00–9:00 | Build or trace the runnable demo and inspect its output |
| Student challenge | 9:00–12:00 | Explain the task below and invite viewers to pause |
| Solution walkthrough | 12:00–14:00 | Compare with the reference solution and acceptance criteria |
| Recap and next episode | 14:00–15:00 | Review the objectives and the continuity note |

These timings are production targets. Keep the challenge card visible briefly and let the learner pause. Larger exercises and capstone practice happen outside the video.

## Complete topic scope

HashMap<String, String>, put/get/containsKey/remove/size and keys replacing an existing value.

## Practical demonstration

Run from this episode’s `demo` directory:

```sh
javac Main.java
java Main
```

**Main.java**

```java
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> environments = new HashMap<>();
        environments.put("booking-api", "DEV");
        environments.put("payment-api", "QA");
        environments.put("booking-api", "PROD");
        System.out.println("booking-api: " + environments.get("booking-api"));
        System.out.println("Contains catalog-api: " + environments.containsKey("catalog-api"));
        System.out.println("Count: " + environments.size());
    }
}
```

**Expected output**

```text
booking-api: PROD
Contains catalog-api: false
Count: 2
```

## Teaching notes

HashMap iteration order is unspecified. Use direct lookup or a separately ordered list of keys for deterministic output. get can return null for a missing key; containsKey is useful when null values are permitted.

**Common beginner mistake:** Expecting put with an existing key to add a second entry, or assuming map iteration follows insertion order.

## Student challenge

Create booking-api -> DEV and payment-api -> QA, update booking-api to PROD, remove payment-api, and handle a missing catalog-api.

**Acceptance criteria:** booking-api maps to PROD; size is one; missing catalog-api prints a friendly message.

[Open the exercise](challenge/README.md). Copy the complete demo directory into your own working folder before modifying it.

<details>
<summary>Student challenge — reference solution</summary>

[Complete solution folder](solution) · [Main.java](solution/Main.java)

```java
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> environments = new HashMap<>();
        environments.put("booking-api", "DEV");
        environments.put("payment-api", "QA");
        environments.put("booking-api", "PROD");
        environments.remove("payment-api");
        System.out.println("booking-api: " + environments.get("booking-api"));
        System.out.println("Count: " + environments.size());
        if (!environments.containsKey("catalog-api")) {
            System.out.println("catalog-api has no configured environment");
        }
    }
}
```

**Expected output**

```text
booking-api: PROD
Count: 1
catalog-api has no configured environment
```

</details>

## Continuity

Day 17 handled ordered inventory. Day 18 enables named lookup; Day 19 signals invalid operations with exceptions.

[Previous lesson](../day-17-arraylists/README.md) · [Next lesson](../day-19-exceptions/README.md)
