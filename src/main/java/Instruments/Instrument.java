package Instruments;

import Shop.Stock;
import jdk.jfr.Description;

import java.util.ArrayList;

public class Instrument extends Stock implements IPlay {

    GuitarType type; //pulled from enum
    private String description; //electric/acoustic -String
    private int numStrings;
    private String stringType; // steel/nylon

    public Instrument(Double costPrice, Double retailValue, String description, GuitarType type, int numStrings, String stringType) {
        super(costPrice, retailValue);
        this.description = description;
        this.type = type;
        this.numStrings = numStrings;
        this.stringType = stringType;
    }

    public String getDescription() {
        return description;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String getStringType() {
        return stringType;
    }
}
