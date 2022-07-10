import exampleMock.CalculatorAvanzada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author freddyar
 */
public class FactorialTest {

    /**
     * Cuando un método depende de uno o más métodos, necesitamos crear Mocks
     * no usar el ejemplo de esta clase
     */

    @Test
    public void verifyFactorial() {

        CalculatorAvanzada calculatorAvanzada = new CalculatorAvanzada();

        int expectedResult = 6;
        int actualResult = calculatorAvanzada.factorial(3);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR!, el factorial es incorrecto");

    }
}
