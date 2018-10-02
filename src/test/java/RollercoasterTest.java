import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster(1.65, 6.00);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.65, rollercoaster.getMinHeight(), 0.01);
    }

    @Test
    public void hasPrice() {
        assertEquals(6.00, rollercoaster.getPrice(), 0.01);
    }
}
