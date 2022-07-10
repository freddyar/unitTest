import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author freddyar
 */
public class CalculatorParamTest {

    @ParameterizedTest
    @CsvSource({
            "2,3,5", "2,1,3" , "4,6,10"
    })
    public void verifySuma(int numberA, int numberB, int expectedResult) {
        Calculator calculator = new Calculator();
        int actualResult = calculator.suma(numberA, numberB);
        Assertions.assertEquals(actualResult, expectedResult, "ERROR!");
    }
}
