import exampleMock.CalculatorAvanzada;
import exampleMock.Multiplica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author freddyar
 */
public class FactorialMockTest {

    // step 2: crear nuestro objeto mock
    Multiplica multiplicaMock = Mockito.mock(Multiplica.class);

    @Test
    public void verificarFactorialMock() {

        // step 3: configurarlo como se comporta el objeto falto
        Mockito.when(multiplicaMock.mult(1, 1)).thenReturn(1);
        Mockito.when(multiplicaMock.mult(1, 2)).thenReturn(2);
        Mockito.when(multiplicaMock.mult(2, 3)).thenReturn(6);

        //step 4: utilizar el objeto falso

        CalculatorAvanzada calculatorAvanzada = new CalculatorAvanzada();
        calculatorAvanzada.setMultiplica(multiplicaMock);

        int expectedResult = 6;
        int actualResult = calculatorAvanzada.factorial(3);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR!, el factorial es incorrecto");

        //step 5: garantizar que utilizamos el objeto mock
        Mockito.verify(multiplicaMock).mult(1, 1);
        Mockito.verify(multiplicaMock).mult(1, 2);
        Mockito.verify(multiplicaMock).mult(2, 3);
    }
}
