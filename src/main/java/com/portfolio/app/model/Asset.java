package com.portfolio.app.model;

public abstract class Asset {

    protected String id;
    protected String name;
    protected double purchasePrice;

    public Asset(String id, String name, double purchasePrice) {
        this.id = id;
        this.name = name;
        this.purchasePrice = purchasePrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public abstract double getCurrentValue();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Purchase Price: " + purchasePrice;
    }
}