import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            if (!config.contains("application=booking-api")) {
                throw new IllegalArgumentException("Expected booking-api configuration");
            }
            Path report = Path.of("report.txt");
            Files.writeString(report, "Application: booking-api\nStatus: ready\n", StandardCharsets.UTF_8);
            System.out.print(Files.readString(report, StandardCharsets.UTF_8));
        } catch (IOException | IllegalArgumentException exception) {
            System.err.println("Cannot create report: " + exception.getMessage());
            System.exit(1);
        }
    }
}
