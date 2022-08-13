import Behaviours.IBuy;
import Instruments.Acoustic;
import Instruments.Electric;
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
