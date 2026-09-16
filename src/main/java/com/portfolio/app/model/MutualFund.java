package com.portfolio.app.model;

public class MutualFund extends Asset {

    private double nav;

    public MutualFund(String mfId,
                      String mfName,
                      double purchasePrice,
                      double nav) {

        super(mfId, mfName, purchasePrice);
        this.nav = nav;
    }

    public double getNav() {
        return nav;
    }

    @Override
    public double getCurrentValue() {
        return nav;
    }

    @Override
    public String toString() {
        return "Mutual Fund ID: " + id +
                ", Mutual Fund Name: " + name +
                ", Purchase Price: " + purchasePrice +
                ", NAV: " + nav;
    }
}