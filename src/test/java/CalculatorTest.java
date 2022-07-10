import calculator.Calculator;
import org.junit.jupiter.api.*;

/**
 * @author freddyar
 */
public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    public void cleanUp() {

    }

    @Test
    public void verifySumaPares() {

        // pasos
        int expectResult = 6;
        int actualResult = calculator.suma(2, 4);

        // verificación
        Assertions.assertEquals(expectResult, actualResult, "ERROR, la suma es incorrecta");
    }

    @Test
    //@Disabled
    public void verifySumaImPares() {

        // pasos
        int expectResult = 4;
        int actualResult = calculator.suma(3, 1);

        // verificación
        Assertions.assertEquals(expectResult, actualResult, "ERROR, la suma es incorrecta");
    }

    @Test
    @Timeout(value = 2) // velocidad
    public void verifyMulPares() throws InterruptedException {

        // pasos
        int expectResult = 6;
        int actualResult = calculator.mul(2, 3);

        // verificación
        Assertions.assertEquals(expectResult, actualResult, "ERROR, la multiplicación es incorrecta");
    }
}
