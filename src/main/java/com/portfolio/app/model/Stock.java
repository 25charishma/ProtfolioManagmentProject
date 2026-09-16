package com.portfolio.app.model;

public class Stock extends Asset {

    private double currentPrice;

    public Stock(String stockId,
                 String stockName,
                 double purchasePrice,
                 double currentPrice) {

        super(stockId, stockName, purchasePrice);
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public double getCurrentValue() {
        return currentPrice;
    }

    @Override
    public String toString() {
        return "Stock ID: " + id +
                ", Stock Name: " + name +
                ", Purchase Price: " + purchasePrice +
                ", Current Price: " + currentPrice;
    }
}