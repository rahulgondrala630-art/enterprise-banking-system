package com.ledgerline.domain;

import java.math.BigDecimal;
import java.util.Currency;

public record Money(BigDecimal amount, Currency currency) {
    public Money {
        if (amount == null || currency == null) throw new IllegalArgumentException("amount and currency are required");
        if (amount.scale() > 2) throw new IllegalArgumentException("amount supports at most two decimals");
    }
    public Money add(Money other) {
        if (!currency.equals(other.currency)) throw new IllegalArgumentException("currencies must match");
        return new Money(amount.add(other.amount), currency);
    }
}
