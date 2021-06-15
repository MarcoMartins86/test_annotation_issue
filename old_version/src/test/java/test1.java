import io.quarkus.redis.client.RedisClient;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.Arrays;

@MyTestAnontation
public class test1 {
    @Inject
    RedisClient client;

    @Test
    @SneakyThrows
    void test1() {
        client.sadd(Arrays.asList("index", "1"));
    }
}
