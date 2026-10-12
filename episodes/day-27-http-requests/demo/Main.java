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
