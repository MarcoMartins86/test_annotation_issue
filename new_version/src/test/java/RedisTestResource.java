import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import lombok.SneakyThrows;
import org.testcontainers.containers.GenericContainer;

import java.util.Map;

import static java.util.Map.entry;

public class RedisTestResource implements QuarkusTestResourceLifecycleManager {
    private GenericContainer container;

    @SneakyThrows
    public Map<String, String> start() {
        container = new GenericContainer("redis:5.0.7")
                .withExposedPorts(6379);

        container.start();

        return Map.ofEntries(entry("quarkus.redis.hosts", "redis://"
                + container.getContainerIpAddress() + ":"
                + container.getMappedPort(6379)));
    }

    public void stop() {
        if (container != null) {
            container.close();
        }
    }
}