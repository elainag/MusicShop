package Shop;

import Accessories.Accessories;
import Instruments.Instrument;
import Parts.Parts;

import java.util.ArrayList;

public abstract class Stock {

    private Double costPrice;
    private Double retailValue;

    public Stock(Double costPrice, Double retailValue) {
        this.costPrice = costPrice;
        this.retailValue = retailValue;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
        return costPrice;
    }

    public Double getRetailValue() {
        return retailValue;
    }

    public Double setRetailValue(Double retailValue) {
        this.retailValue = retailValue;
        return retailValue;
    }
}

