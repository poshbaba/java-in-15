import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HealthPolicyTest {
    @Test void calculatesPercentageWithoutIntegerTruncation() {
        assertEquals(70.0, HealthPolicy.percentage(10, 7), 0.0001);
    }
    @Test void classifiesThresholdBoundaries() {
        assertEquals("Approved", HealthPolicy.classify(95));
        assertEquals("Review required", HealthPolicy.classify(94.9));
        assertEquals("Review required", HealthPolicy.classify(80));
        assertEquals("Rejected", HealthPolicy.classify(79.9));
    }
    @Test void rejectsZeroTotal() {
        assertThrows(IllegalArgumentException.class, () -> HealthPolicy.percentage(0, 0));
    }
}
