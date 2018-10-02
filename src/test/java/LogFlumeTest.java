import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogFlumeTest {

    LogFlume logFlume;
    Customer customer;
    Customer customer2;

    @Before
    public void before(){
        customer2 = new Customer("Johnny", 1.49, 4.99);
        customer = new Customer("Jimmy", 1.60, 20.00);
        logFlume = new LogFlume(1.5, 5.00);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.5, logFlume.getMinHeight(), 0.01);
    }

    @Test
    public void hasPrice() {
        assertEquals(5.00, logFlume.getPrice(), 0.01);
    }

    @Test
    public void isTallEnoughToRide() {
        assertEquals(true, logFlume.isTallEnough(customer));
    }

    @Test
    public void isNotTallEnoughToRide() {
        assertEquals(false, logFlume.isTallEnough(customer2));
    }

    @Test
    public void hasEnoughMoneyToRide() {
        logFlume.canPay(customer);
        assertEquals(15.00, customer.getMoney(), 0.01);
    }

    @Test
    public void doesntHaveEnoughMoneyToRide() {
        logFlume.canPay(customer2);
        assertEquals(4.99, customer2.getMoney(), 0.01);
    }
}
