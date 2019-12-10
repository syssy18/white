package com.cgi.paris.fs.comex.white.fitnesse.fixture;

import com.cgi.paris.fs.comex.white.core.bean.Tranche;
import fitnesse.fixtures.RowEntryFixture;

import java.util.ArrayList;
import java.util.List;

public class GivenTranches extends RowEntryFixture {

    public static final List<Tranche> TRANCHES = new ArrayList<>();

    public GivenTranches() {
        TRANCHES.clear();
    }

    @Override
    public void enterRow() {
        final Tranche tranche = new Tranche();
        TRANCHES.add(tranche);
    }

}
