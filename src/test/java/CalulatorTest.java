import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalulatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void testMult(){
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
}
