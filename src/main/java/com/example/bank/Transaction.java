package com.example.bank;

import java.math.BigDecimal;
import java.time.Instant;

public record Transaction(Type type, BigDecimal amount, BigDecimal balanceAfter, Instant timestamp) {
    public enum Type { DEPOSIT, WITHDRAWAL }
}
