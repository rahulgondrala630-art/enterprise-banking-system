package com.ledgerline;

import com.ledgerline.domain.Money;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Currency;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {
    @Test void addsSameCurrencyValues() {
        var usd = Currency.getInstance("USD");
        assertEquals(new BigDecimal("12.50"), new Money(new BigDecimal("10.00"), usd).add(new Money(new BigDecimal("2.50"), usd)).amount());
    }
}
