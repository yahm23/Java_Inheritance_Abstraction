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
        developer =new Developer("Yousef","1234",26000.00);
        dbAdmin = new DatabaseAdmin("Morgaine","12343",27000.00);

    }
    @Test
    public void employeeHasName(){
        assertEquals("Yousef",developer.getName());
        assertEquals("Morgaine",dbAdmin.getName());
    }

    @Test
    public void employeeHasNi(){
        assertEquals("1234",developer.getNi());
        assertEquals("12343",dbAdmin.getNi());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(26000.00,developer.getSalary(),0.001);
        assertEquals(27000.00,dbAdmin.getSalary(),0.001);
    }

    @Test
    public void employeeHasSalaryIncrease(){
        developer.raiseSalary(1000.00);
        assertEquals(27000.00,developer.getSalary(),0.001);
    }

    @Test
    public void employeeCanBePaidBonus(){

        assertEquals(270.00, dbAdmin.getBonus(),0.001);
    }




}
