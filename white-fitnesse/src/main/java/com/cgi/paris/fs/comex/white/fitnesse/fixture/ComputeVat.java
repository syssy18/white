package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.core.service.VatService;
import fit.ColumnFixture;

public class ComputeVat extends ColumnFixture {

    private final VatService vatService = FitnesseSpring.getBean(VatService.class);

    private double amount;

    public double frenchVat() {
        return this.vatService.computeFrenchVat(this.amount);
    }

    public double germainVat() {
        return this.vatService.computeGermainVat(this.amount);
    }

}
