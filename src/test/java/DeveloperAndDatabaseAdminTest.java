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
//    @Before
//    public void setup(){
//
//    }
    @Test
    public void employeeHasName(){
        developer =new Developer("Yousef","1234",2600000.00);
        assertEquals("Yousef",developer.getName());
    }

}
