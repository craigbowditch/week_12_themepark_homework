import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Jimmy", 1.67, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jimmy", customer.getName());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.67, customer.getHeight(), 0.01);
    }

    @Test
    public void hasMoney() {
        assertEquals(20.00, customer.getMoney(), 0.01);
    }
}
