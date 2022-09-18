
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculatorTest extends Calculator {

    @Test
    void testGetResultForPlusFunction() {
        double res1 = getResult(4, 6, '+');
        Assertions.assertEquals(res1, 10);
        double res2 = getResult(-6, -5, '+');
        Assertions.assertEquals(res2, -11);
        double res3 = getResult(7, -3, '+');
        Assertions.assertEquals(res3, 4);
    }

    @Test
    void testGetResultForSubtractionFunction() {
        double res1 = getResult(4, 6, '-');
        Assertions.assertEquals(res1, -2);
        double res2 = getResult(-6, -5, '-');
        Assertions.assertEquals(res2, -1);
        double res3 = getResult(7, -3, '-');
        Assertions.assertEquals(res3, 10);
    }

    @Test
    void testGetResultForMultiplicationFunction() {
        double res1 = getResult(4, 6, '*');
        Assertions.assertEquals(res1, 24);
        double res2 = getResult(-6, -5, '*');
        Assertions.assertEquals(res2, 30);
        double res3 = getResult(7, -3, '*');
        Assertions.assertEquals(res3, -21);
    }

    @Test
    void testGetResultForDivisionFunction() {
        double res1 = getResult(20, 5, '/');
        Assertions.assertEquals(res1, 4);
        double res2 = getResult(-20, -5, '/');
        Assertions.assertEquals(res2, 4);
        double res3 = getResult(20, -5, '/');
        Assertions.assertEquals(res3, -4);
    }

}