package com.cgi.paris.fs.comex.white.core.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VatService {

    private static final BigDecimal FRENCH_VAT = new BigDecimal("0.2");
    private static final BigDecimal GERMAIN_VAT = new BigDecimal("0.19");

    public double computeFrenchVat(final double amount) {
        return this.computeVat(amount, FRENCH_VAT);
    }

    public double computeGermainVat(final double amount) {
        return this.computeVat(amount, GERMAIN_VAT);
    }

    private double computeVat(final double amount, final BigDecimal vat) {
        return BigDecimal.valueOf(amount)
                .multiply(vat)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

}
