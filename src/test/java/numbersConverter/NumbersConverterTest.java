package numbersConverter;

import numbersConverter.NumbersConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersConverterTest {

    @Test
    public void testDivThree() throws Exception {
        NumbersConverter nc = new NumbersConverter();
        assertTrue("Fizz".equals(nc.divThree(3).toString()));
    }

    @Test
    public void testDivThreeNotThree() throws Exception {
        NumbersConverter nc = new NumbersConverter();
        assertNotNull(nc.divThree(4));
    }

    @Test
    public void testDivFive() throws Exception {
        NumbersConverter nc = new NumbersConverter();
        assertTrue("Buzz".equals(nc.divFiveAndThree(5).toString()));
    }

    @Test
    public void testDivThreeNotFive() throws Exception {
        NumbersConverter nc = new NumbersConverter();
        assertNotNull(nc.divThree(4));
    }

    @Test
    public void testDivThreeAndFive() throws Exception {
        NumbersConverter nc = new NumbersConverter();
        assertTrue("FizzBuzz".equals(nc.divFiveAndThree(15).toString()));

    }
}