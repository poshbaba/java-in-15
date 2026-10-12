import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
// Supplied local fixture. Server implementation is outside this lesson's scope.
final class DemoServer implements AutoCloseable {
    private final HttpServer server;
    DemoServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/health", exchange -> {
            int status = "unhealthy=true".equals(exchange.getRequestURI().getQuery()) ? 503 : 200;
            byte[] body = (status == 200 ? "healthy" : "unavailable").getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
            exchange.sendResponseHeaders(status, body.length);
            try (var stream = exchange.getResponseBody()) { stream.write(body); }
            exchange.close();
        });
        server.start();
    }
    String baseUrl() { return "http://127.0.0.1:" + server.getAddress().getPort(); }
    @Override public void close() { server.stop(0); }
}
