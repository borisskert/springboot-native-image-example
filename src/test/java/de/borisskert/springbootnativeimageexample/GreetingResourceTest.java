package de.borisskert.springbootnativeimageexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class GreetingResourceTest {

    @Autowired
    private WebTestClient client;

    @Test
    void shouldRespond() throws Exception {
        client.get()
                .uri("/greeting")
                .exchange()
                .expectBody(String.class)
                .isEqualTo("Hello World!");
    }
}
