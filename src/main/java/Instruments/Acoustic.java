package Instruments;

public class Acoustic extends Instrument {

    public Acoustic(Double costPrice, Double retailValue, String description, GuitarType type, int numStrings, String stringType) {
        super(costPrice, retailValue, description, type, numStrings, stringType);
    }

    public GuitarType getType() {
        return GuitarType.Classical;
    }


}
