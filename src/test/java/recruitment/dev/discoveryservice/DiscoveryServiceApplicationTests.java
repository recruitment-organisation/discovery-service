package recruitment.dev.discoveryservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

class DiscoveryServiceApplicationTests {

    @Test
    void enablesSpringBootAndEurekaServer() {
        org.junit.jupiter.api.Assertions.assertTrue(
                DiscoveryServiceApplication.class.isAnnotationPresent(SpringBootApplication.class)
        );
        org.junit.jupiter.api.Assertions.assertTrue(
                DiscoveryServiceApplication.class.isAnnotationPresent(EnableEurekaServer.class)
        );
    }

}
