package ac.za.cput.projects;



import org.junit.Test;

import java.util.Map;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.assertNotSame;

public class IdentityTest {
    Identity identity;
    Identity identity2;

    @Test
    public void ObjectsTheSame() throws Exception {
        identity =new Identity();
        identity.employeeId("Staff1","philranti@gmail.com");
        identity2 =new Identity();
        identity.employeeId("Staff2", "preyserj@gmail.com");


            Map map = identity.hash;
    Map map2 = identity2.hash;
    map = map2;

    assertSame("Failed because objects are not the same ", map, map2);
}
    @Test
    public void ObjectsNotTheSame() throws Exception {
        /*Arrange*/
        identity =new Identity();
        identity.employeeId("Staff1","philranti@gmail.com");
        identity2 =new Identity();
        identity.employeeId("Staff2", "preyserj@gmail.com");

        Map map = identity.hash;
        Map map2= identity2.hash;

        assertNotSame("Failed because objects are same ", map, map2);
    }


        }
