import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunawayTrainTest {

    RunawayTrain runawayTrain;
    Customer customer;
    Customer customer2;

    @Before
    public void before(){
        customer = new Customer("Jimmy", 1.65, 6.00);
        customer2 = new Customer("Stevie", 1.50, 4.00);
        runawayTrain = new RunawayTrain(1.60, 4.00);
    }

    @Test
    public void hasMinHeight() {
        assertEquals(1.60, runawayTrain.getMinHeight(), 0.01);
    }

    @Test
    public void hasPrice() {
        assertEquals(4.00, runawayTrain.getPrice(), 0.01);
    }

    @Test
    public void isTallEnoughToRide() {
        assertEquals(true, runawayTrain.checkHeight(customer));
    }

    @Test
    public void isNotTallEnoughToRide() {
        assertEquals(false, runawayTrain.checkHeight(customer2));
    }
}
