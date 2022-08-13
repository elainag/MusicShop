import Instruments.Electric;
import Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

   Electric electric;

   @Before
    public void before(){
       electric = new Electric(200.00, 350.00, "Electric", GuitarType.Solid, 6, "Steel");
   }

    @Test
    public void canGetType() {
        assertEquals(GuitarType.Solid, electric.getType());
    }

}
