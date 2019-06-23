import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalulatorTest {

    private Calculator calc = new Calculator();
    private Timeout timeout = new Timeout();

    @Test
    public void testSum(){
        Assert.assertEquals(5.0, calc.sum(2.3, 2.7));
    }

    @Test
    public void testSub(){
        Assert.assertEquals(1.0, calc.sub(1.5, 0.5));
    }

    @Test
    public void testMult(){
        Assert.assertEquals(15, calc.mult(5, 3));
    }

    @Test
    public void testMultDoubles(){
        Assert.assertEquals(11.2, calc.mult(5.6, 2));
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDiv(){
        Assert.assertEquals(NumberFormatException.class, calc.div(1, 0));
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivDoubles(){
        Assert.assertEquals(ArithmeticException.class, calc.div(1.0, 0));
    }

    @Test
    public void testPow(){
        Assert.assertEquals(Math.sqrt(125), calc.pow(5, 1.5));
    }

    @Test
    public void testSqrt() {
        Assert.assertEquals(Math.sqrt(-5), calc.sqrt(-5));
    }

    @Test
    public void tesTg(){
        Assert.assertEquals( Math.tan(30), calc.tg(30));
    }

    @Test
    public void testCtg(){
        Assert.assertEquals(1/Math.tan(30), calc.ctg(30));
    }

    @Test
    public void testCos(){
        Assert.assertEquals(Math.cos(30), calc.cos(30));
    }

    @Test
    public void testSin(){
        Assert.assertEquals(Math.sin(30), calc.sin(30));
    }

    @Test
    public void testIsPositive(){
        Assert.assertTrue(calc.isPositive(1));
    }

    @Test
    public void testIsNegative(){
        Assert.assertTrue(calc.isNegative(-1));
    }

    @Test void testSleep(){
        timeout.sleep(Integer.MAX_VALUE + 1);
    }
}
