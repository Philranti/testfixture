package ac.za.cput.projects;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

public class DisablingTest {

    private String message = " This is me";
    private Disabling dis;

    @Before
    public void setUp(){
        dis =  new Disabling(message);
    }

    @Test
    public void printMessage() {
        //	Check type return
        assertThat(dis.printingMessage(), isA(String.class));
        assertEquals(message, dis.printingMessage());

    }

    @Test
    public void displayMessage() {
        String display = dis.displayMessage();
        assertThat(display, isA(String.class));
        assertEquals("Phillip" + message,display);
    }


    @Ignore
    @Test
    public void testSalutationMessageForExecutives() {
        assertThat(dis.implement(), isA(String.class));
        assertEquals(message, dis.implement());
    }
}
