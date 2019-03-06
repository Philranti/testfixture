package ac.za.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualityTest {
    Equality equal;

    @Before
    public void setUp(){
        equal = new Equality();
    }

    @Test
    public void equality(){
        Assert.assertEquals(equal.expected(9), equal.addition(3,6));
        Assert.assertEquals(equal.expected(9), equal.multiply(3,3));
    }

}
