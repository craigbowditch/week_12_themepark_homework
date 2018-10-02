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
        assertEquals(true, rollercoaster.isTallEnough(customer));
    }

    @Test
    public void isNotTallEnoughToRide() {
        assertEquals(false, rollercoaster.isTallEnough(customer2));
    }

    @Test
    public void hasEnoughMoneyToRide() {
        rollercoaster.canPay(customer);
        assertEquals(0, customer.getMoney(), 0.01);
    }

    @Test
    public void doesntHaveEnoughMoneyToRide() {
        rollercoaster.canPay(customer2);
        assertEquals(3.00, customer2.getMoney(), 0.01);
    }
}
