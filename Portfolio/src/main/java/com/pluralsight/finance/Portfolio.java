package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", assets=" + assets +
                '}';
    }

    public void add(Valuable asset) {
        this.assets.add(asset);
    }

    public Valuable getMostValuable() {
        double highValueAsset = 0;
        Valuable result = null;
        for (Valuable v : this.assets) {
            if (v.getValue() > highValueAsset) {
                highValueAsset = v.getValue();
                result = v;
            }
        }
        return result;
    }

    public Valuable getLeastValuable() {
        double leastValueAsset = 0;
        Valuable result = null;
        for (Valuable v : this.assets) {
            if (v.getValue() < leastValueAsset) {
                leastValueAsset = v.getValue();
                result = v;
            }
        }
        return result;
    }

    @Override
    public double getValue() {
        double totalAsset = 0;
        for (Valuable v : this.assets) {
            totalAsset += v.getValue();
        }
        return totalAsset;
    }
}
