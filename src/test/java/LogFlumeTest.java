import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogFlumeTest {

    LogFlume logFlume;

    @Before
    public void before(){
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
}
