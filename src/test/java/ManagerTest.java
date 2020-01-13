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
}
