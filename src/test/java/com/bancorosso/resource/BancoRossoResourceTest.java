package com.bancorosso.resource;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.Path;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class BancoRossoResourceTest {

    @Test
    void shouldReturnGreetingString(){
        when()
                .get("/banco-rosso")
                .then()
                .statusCode(200)
                .statusCode(200)
                .body(equalTo("The Banco rosso app is app and running!"));
    }
}
