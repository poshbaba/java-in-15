import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
public final class Configuration {
    public static ArrayList<Application> load(Path path) throws IOException {
        JsonNode root = new ObjectMapper().readTree(path.toFile());
        if (root == null || !root.isArray() || root.isEmpty()) {
            throw new IllegalArgumentException("Configuration must be a nonempty application array");
        }
        ArrayList<Application> applications = new ArrayList<>();
        HashMap<String, Boolean> names = new HashMap<>();
        for (JsonNode node : root) {
            if (!node.isObject() || !node.path("name").isTextual()) {
                throw new IllegalArgumentException("Each application needs a text name");
            }
            String name = node.path("name").asText();
            if (names.containsKey(name)) { throw new IllegalArgumentException("Duplicate application: " + name); }
            Application app = new Application(name, positiveInt(node, "totalReplicas"),
                    nonnegativeInt(node, "healthyReplicas"), positiveInt(node, "successAttempt"));
            applications.add(app);
            names.put(name, true);
        }
        return applications;
    }
    private static int positiveInt(JsonNode node, String field) {
        int value = nonnegativeInt(node, field);
        if (value < 1) { throw new IllegalArgumentException(field + " must be positive"); }
        return value;
    }
    private static int nonnegativeInt(JsonNode node, String field) {
        JsonNode value = node.path(field);
        if (!value.isIntegralNumber() || !value.canConvertToInt() || value.intValue() < 0) {
            throw new IllegalArgumentException(field + " must be a nonnegative integer");
        }
        return value.intValue();
    }
}
