import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;
class DeploymentManagerTest {
    @Test void calculatesAndClassifiesHealth() {
        assertEquals(95.0, new Application("booking-api", 20, 19, 2).healthPercentage(), 0.0001);
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsInvalidApplicationState() {
        assertThrows(IllegalArgumentException.class, () -> new Application("api", 0, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Application("api", 3, 4, 1));
        assertThrows(IllegalArgumentException.class, () -> new Application(" ", 3, 3, 1));
    }
    @Test void stopsAtSuccessfulAttempt() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        boolean result = DeploymentService.deploy(new Application("api", 3, 3, 2), Environment.QA, 5, new PrintStream(bytes));
        assertTrue(result);
        assertEquals(2, bytes.toString().lines().count());
    }
    @Test void stopsAtMaximumAttempts() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        assertFalse(DeploymentService.deploy(new Application("api", 3, 3, 4), Environment.QA, 3, new PrintStream(bytes)));
        assertEquals(3, bytes.toString().lines().count());
    }
    @Test void rejectsInvalidRetryLimit() {
        assertThrows(IllegalArgumentException.class, () -> DeploymentService.deploy(
                new Application("api", 3, 3, 1), Environment.DEV, 0, System.out));
    }
    @Test void rejectsMalformedConfig(@TempDir Path directory) throws Exception {
        Path path = directory.resolve("apps.json");
        Files.writeString(path, "[{\"name\":\"api\",\"totalReplicas\":2.5,\"healthyReplicas\":2,\"successAttempt\":1}]");
        assertThrows(IllegalArgumentException.class, () -> Configuration.load(path));
        Files.writeString(path, "[]");
        assertThrows(IllegalArgumentException.class, () -> Configuration.load(path));
    }
    @Test void loadsInventoryInFileOrder(@TempDir Path directory) throws Exception {
        Path path = directory.resolve("apps.json");
        Files.writeString(path, "[{\"name\":\"api\",\"totalReplicas\":3,\"healthyReplicas\":3,\"successAttempt\":2}]");
        assertEquals("api", Configuration.load(path).get(0).getName());
    }
}
