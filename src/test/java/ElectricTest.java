import Instruments.Electric;
import Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

   Electric electric;
   Electric electric1;

   @Before
    public void before(){
       electric = new Electric(200.00, 400.00, "Electric", GuitarType.Solid, 6, "Steel");
       electric1 = new Electric(1000.00, 1500.00, "Electric", GuitarType.Solid, 6, "Steel");
   }

    @Test
    public void canGetType() {
        assertEquals(GuitarType.Solid, electric.getType());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(200.00, electric.getCostPrice(), 0.00);
    }
    @Test
    public void canSetCostPrice(){
        assertEquals(275.00, electric.setCostPrice(275.00), 0.00);
    }
    @Test
    public void canGetRetailValue(){
        assertEquals(1500.00, electric1.getRetailValue(), 0.00);
    }

    @Test
    public void canSetRetailValue(){
        assertEquals(350.00, electric.setRetailValue(350.00), 0.00);
    }
    @Test
    public void canGetDescription(){
        assertEquals("Electric", electric.getDescription());
    }
    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, electric.getNumStrings());
    }

    @Test
    public void canGetTypeofStrings(){
        assertEquals("Steel", electric.getStringType());
    }
    @Test
    public void canPlay(){
       assertEquals("Some awesome riff", electric.play());
    }
}



