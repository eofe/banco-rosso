package com.bancorosso.record;

import java.math.BigDecimal;
import java.util.UUID;

public record Transaction(UUID id, BigDecimal amount) {
}
