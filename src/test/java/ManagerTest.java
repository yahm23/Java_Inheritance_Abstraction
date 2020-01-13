import Staff.Employee;
import Staff.Manegement.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ManagerTest {
    Manager manager;

    @Before
    public void setup(){
    manager = new Manager("Yousef","1234",26000.00,"HR");
    }

    @Test
    public void canGetDept(){
        assertEquals("HR",manager.getDept());
    }

    @Test
    public void canManagerSalary(){
        assertEquals(26000,manager.getSalary(),0.001);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Yousef",manager.getName());
    }

    @Test
    public void employeeHasNi(){
        assertEquals("1234",manager.getNi());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(26000.00,manager.getSalary(),0.001);
    }

    @Test
    public void employeeHasSalaryIncrease(){
        manager.raiseSalary(1000.00);
        assertEquals(27000.00,manager.getSalary(),0.001);
    }

    @Test
    public void employeeCanBePaidBonus(){

        assertEquals(260.00, manager.getBonus(),0.001);
    }
}
