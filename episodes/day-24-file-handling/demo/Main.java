import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        try {
            String config = Files.readString(Path.of("config.txt"), StandardCharsets.UTF_8);
            System.out.print(config);
        } catch (IOException exception) {
            System.err.println("Cannot read config.txt: " + exception.getMessage());
            System.exit(1);
        }
    }
}
