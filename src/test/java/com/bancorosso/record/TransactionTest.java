package com.bancorosso.record;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@QuarkusTest
public class TransactionTest {

    @Test
    void testShouldDeserializeTx() throws IOException {

        Jsonb jsonb = JsonbBuilder.create();
        String jsonContent = new String(Files.readAllBytes(Paths.get("src/test/resources/data/tx.json")));

        var tx = jsonb.fromJson(jsonContent, Transaction.class);


        assertThat(tx.id()).isEqualTo(UUID.fromString("c8ec9272-1089-448a-b702-06afefa43927"));
        assertThat(tx.amount()).isEqualTo(new BigDecimal("145.10"));
    }
}
