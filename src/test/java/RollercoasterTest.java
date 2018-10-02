import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Customer customer;
    Customer customer2;

    @Before
    public void before(){
        customer = new Customer("Jimmy", 1.65, 6.00);
        customer2 = new Customer("Stevie", 1.50, 3.00);
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

    @Test
    public void isTallEnoughToRide() {
        assertEquals(true, rollercoaster.checkHeight(customer));
    }

    @Test
    public void isNotTallEnoughToRide() {
        assertEquals(false, rollercoaster.checkHeight(customer2));
    }

    @Test
    public void hasEnoughMoneyToRide() {
        assertEquals(true, rollercoaster.checkMoney(customer));
    }

    @Test
    public void doesntHaveEnoughMoneyToRide() {
        assertEquals(false, rollercoaster.checkMoney(customer2));
    }
}
