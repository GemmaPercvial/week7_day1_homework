import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VisitorTest {
    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(John, 18, "5ft6", 100.00);
    }

    @Test
    public void getName(){
        assertEquals(John, visitor.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals("5ft6", visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(100.00, visitor.getMoney(), 0.0);
    }

}