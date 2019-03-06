package ac.za.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FailingTest {
    Failing fail;



    @Test
    public void failing(){
        Assert.assertEquals(fail.expected(10), fail.addition(3,6));
        Assert.assertEquals(fail.expected(9), fail.multiply(3,3));
    }
}
