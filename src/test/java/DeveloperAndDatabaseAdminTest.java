import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeveloperAndDatabaseAdminTest {

    Developer developer;
    DatabaseAdmin dbAdmin;
//
    @Before
    public void setup(){
        developer =new Developer("Yousef","1234",2600000.00);
        dbAdmin = new DatabaseAdmin("Morgaine","12343",27000.00);

    }
    @Test
    public void employeeHasName(){
        assertEquals("Yousef",developer.getName());
        assertEquals("Morgaine",dbAdmin.getName());
    }
//    @Test
//    public void employeeHasNi(){
//        assertEquals();
//    }
}
