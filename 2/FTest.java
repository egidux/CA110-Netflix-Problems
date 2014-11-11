import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

public class FTest {

    @Test
    public void fac_of_0() {
		assertEquals(Factorial.factorial(0),1);
    }

    @Test
    public void fac_of_1() {
		assertEquals(Factorial.factorial(0),1);
    }

    @Test
    public void fac_of_12() {
		assertEquals(Factorial.factorial(12),479001600);
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
}