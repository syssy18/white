package com.cgi.paris.fs.comex.white.core.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VatService {

    private static final BigDecimal FRENCH_VAT = new BigDecimal("0.2");
    private static final BigDecimal GERMAIN_VAT = new BigDecimal("0.19");

    public double computeFrenchVat(final double i) {
        return BigDecimal.valueOf(i)
                .multiply(FRENCH_VAT)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    public double computeGermainVat(final double i) {
        return BigDecimal.valueOf(i)
                .multiply(GERMAIN_VAT)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

}
