package com.battybuilds;

import java.math.BigDecimal;

public class RpnCalculator {
    private BigDecimal accumulator = BigDecimal.ZERO;

    public BigDecimal getAccumulator() {
        return accumulator;
    }

    public BigDecimal setAccumulator(BigDecimal number) {
        accumulator = number;
        return number;
    }
}
