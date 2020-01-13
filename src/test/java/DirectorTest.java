
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





}
