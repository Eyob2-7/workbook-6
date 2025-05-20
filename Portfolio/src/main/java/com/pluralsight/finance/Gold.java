package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    // Constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Calculates the value per ounce, if weight is valid.
    @Override
    public double getValue() {
        if (weight == 0) return 0;
        return weight * ( getMarketValue() / weight) ;
    }
}
