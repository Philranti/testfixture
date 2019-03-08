package ac.za.cput.projects;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TimeoutTest {
    private static Timeouts time;

    @BeforeClass
    public static void init() {
        time = new Timeouts(20, 2);
    }

    @Test(timeout = 2000)
    public void totalCashPrice() throws InterruptedException {
        assertThat(20.0, is(time.getPrice()));
    }

    @Test(timeout = 1000)
    public void totalQuantityTest() throws InterruptedException {
        assertThat(2, is(time.getQuantity()));
    }

}
