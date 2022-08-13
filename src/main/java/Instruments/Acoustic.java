package Instruments;

public class Acoustic extends Instrument {

    public Acoustic(Double costPrice, Double retailValue, String description, GuitarType type, int numStrings, String stringType) {
        super(costPrice, retailValue, description, type, numStrings, stringType);
    }

    public GuitarType getType() {
        return GuitarType.Classical;
    }
    public String play(){
        return "Some mellow chords";
    }
    public String buy(){
        return "Congrats you've just bought more stock!";
    }

    public String sell(){
        return "Congrats you've just made a sale!";
    }




}
