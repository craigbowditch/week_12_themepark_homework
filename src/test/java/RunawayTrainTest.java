import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunawayTrainTest {

    RunawayTrain runawayTrain;

    @Before
    public void before(){
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
}
