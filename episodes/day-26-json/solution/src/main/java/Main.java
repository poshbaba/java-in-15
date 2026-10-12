import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            JsonNode config = new ObjectMapper().readTree(Path.of("config.json").toFile());
            if (config == null || !config.isObject() || !config.path("application").isTextual()
                    || config.path("application").asText().isBlank()
                    || !config.path("environment").isTextual()) {
                throw new IllegalArgumentException("Application and environment must be text fields");
            }
            JsonNode replicas = config.path("replicas");
            if (!replicas.isIntegralNumber() || !replicas.canConvertToInt() || replicas.intValue() < 1) {
                throw new IllegalArgumentException("Replicas must be a positive integer");
            }
            Environment environment = Environment.valueOf(config.path("environment").asText());
            System.out.println("Application: " + config.path("application").asText());
            System.out.println("Environment: " + environment);
            System.out.println("Replicas: " + replicas.intValue());
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Invalid configuration: " + exception.getMessage());
            System.exit(1);
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
