
import Staff.Manegement.Director;
import Staff.Manegement.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Morgaine","1234",28000.00,"Management", 100000.00);
    }


    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.001);
    }

    @Test
    public void canGetDept(){
        assertEquals("Management",director.getDept());
    }

    @Test
    public void canManagerSalary(){
        assertEquals(28000.00,director.getSalary(),0.001);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Morgaine",director.getName());
    }

    @Test
    public void employeeHasNi(){
        assertEquals("1234",director.getNi());
    }

    @Test
    public void employeeHasSalary(){
        assertEquals(28000.00,director.getSalary(),0.001);
    }

    @Test
    public void employeeHasSalaryIncrease(){
        director.raiseSalary(1000.00);
        assertEquals(29000.00,director.getSalary(),0.001);
    }

    @Test
    public void directorCanBePaidBonus(){

        assertEquals(560.00, director.getBonus(),0.001);
    }

    @Test
    public void cannotRaiseSalaryWithNegativeValue(){
        director.raiseSalary(-1000.00);
        assertEquals(28000.00, director.getSalary(), 0.001);
    }

    @Test
    public void cannotHaveNullEmployee(){
        director.setName(null);
        assertEquals("Morgaine", director.getName());
    }

    @Test
    public void canChangeEmployeeName(){
        director.setName("Yousef");
        assertEquals("Yousef", director.getName());
    }








}
