package com.portfolio.app.model;

public class Holding {

    private String holdingId;
    private Asset asset;
    private int quantity;

    public Holding(String holdingId, Asset asset, int quantity) {
        this.holdingId = holdingId;
        this.asset = asset;
        this.quantity = quantity;
    }

    public String getHoldingId() {
        return holdingId;
    }

    public Asset getAsset() {
        return asset;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue() {
        return asset.getCurrentValue() * quantity;
    }

    @Override
    public String toString() {
        return "Holding ID: " + holdingId +
                ", " + asset +
                ", Quantity: " + quantity +
                ", Total Value: " + getTotalValue();
    }
}