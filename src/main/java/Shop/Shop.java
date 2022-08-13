package Shop;


import Behaviours.IBuy;
import Behaviours.ISell;
import Instruments.Acoustic;

import java.util.ArrayList;

public class Shop {

    private ArrayList<IBuy> purchased;
    private ArrayList<ISell> sold;

    public Shop() {
        this.purchased = new ArrayList<>();
        this.sold = new ArrayList<>();

    }
    public int addStock(IBuy acoustic){
        this.purchased.add(acoustic);
        return purchased.size();
    }public int sellStock(ISell acoustic){
        this.sold.add(acoustic);
        return sold.size();
    }

}



