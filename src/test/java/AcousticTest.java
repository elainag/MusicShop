import Instruments.Acoustic;
import Instruments.GuitarType;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticTest {

    Acoustic acoustic;
    Acoustic acoustic1;

    @Before
    public void before(){
        acoustic = new Acoustic(150.00, 200.00, "Acoustic", GuitarType.Classical, 12, "Nylon");
        acoustic1 = new Acoustic(250.00, 400.00, "Acoustic", GuitarType.Dreadnought, 6, "Steel");
    }

    @Test
    public void canGetType() {
        assertEquals(GuitarType.Classical, acoustic.getType());
    }
    @Test
    public void canGetCostPrice(){
        assertEquals(150.00, acoustic.getCostPrice(), 0.00);
    }
    @Test
    public void canSetCostPrice(){
        assertEquals(175.00, acoustic.setCostPrice(175.00), 0.00);
    }
    @Test
    public void canGetRetailValue(){
        assertEquals(400.00, acoustic1.getRetailValue(), 0.00);
    }

    @Test
    public void canSetRetailValue(){
        assertEquals(350.00, acoustic.setRetailValue(350.00), 0.00);
    }
    @Test
    public void canGetDescription(){
        assertEquals("Acoustic", acoustic.getDescription());
    }
    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, acoustic1.getNumStrings());
    }

    @Test
    public void canGetTypeofStrings(){
        assertEquals("Steel", acoustic1.getStringType());
    }
}
