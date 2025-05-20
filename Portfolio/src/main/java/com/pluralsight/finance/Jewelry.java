package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    // Constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }


    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    // Gets the value of the jewelery item.
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
