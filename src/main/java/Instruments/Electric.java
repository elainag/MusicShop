package Instruments;

public class Electric extends Instrument {

    public Electric(Double costPrice, Double retailValue, String description, GuitarType type, int numStrings, String stringType) {
        super(costPrice, retailValue, description, type, numStrings, stringType);
    }

    public GuitarType getType() {
        return GuitarType.Solid;
    }


}
