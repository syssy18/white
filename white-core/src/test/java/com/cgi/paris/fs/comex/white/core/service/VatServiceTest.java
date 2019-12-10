package com.cgi.paris.fs.comex.white.core.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VatServiceTest {

    @Test
    public void computeFrenchVat() {
        final VatService vatService = new VatService();
        assertThat(vatService.computeFrenchVat(1_000)).isEqualTo(200);
        assertThat(vatService.computeFrenchVat(2_000)).isEqualTo(400);
        assertThat(vatService.computeFrenchVat(3_000)).isEqualTo(600);
        assertThat(vatService.computeFrenchVat(352.52)).isEqualTo(70.5);
        assertThat(vatService.computeFrenchVat(352.54)).isEqualTo(70.51);
    }

    @Test
    public void computeGermainVat() {
        final VatService vatService = new VatService();
        assertThat(vatService.computeGermainVat(1_000)).isEqualTo(190);
        assertThat(vatService.computeGermainVat(2_000)).isEqualTo(380);
        assertThat(vatService.computeGermainVat(3_000)).isEqualTo(570);
        assertThat(vatService.computeGermainVat(352.49)).isEqualTo(66.97);
        assertThat(vatService.computeGermainVat(352.54)).isEqualTo(66.98);
    }

}
