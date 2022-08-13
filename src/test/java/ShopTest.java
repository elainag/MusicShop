import Behaviours.IBuy;
import Instruments.Acoustic;
import Instruments.Electric;
import Instruments.GuitarType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Acoustic acoustic;
    Electric electric;

    @Before
    public void before(){
        shop = new Shop();
        acoustic = new Acoustic(150.00, 200.00, "Acoustic", GuitarType.Classical, 12, "Nylon");
        electric = new Electric(1000.00, 1500.00, "Electric", GuitarType.Solid, 6, "Steel");
    }

    @Test
    public void buyStock(){
       assertEquals(1, shop.addStock(acoustic));
    }
    @Test
    public void sellStock(){
        assertEquals(1,shop.sellStock(acoustic));
    }

}
