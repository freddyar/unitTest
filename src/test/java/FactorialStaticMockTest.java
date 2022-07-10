import exampleMockStatic.AdvancedCalculator;
import exampleMockStatic.MathHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

/**
 * @author freddyar
 */
public class FactorialStaticMockTest {

    @Test
    public void verifyFactorial() {
        MockedStatic<MathHelper> objectMocked = Mockito.mockStatic(MathHelper.class);
        objectMocked.when(() -> MathHelper.mult(1, 1)).thenReturn(1);
        objectMocked.when(() -> MathHelper.mult(1, 2)).thenReturn(2);
        objectMocked.when(() -> MathHelper.mult(2, 3)).thenReturn(6);

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int expextedResult = 6;
        int actualResult = advancedCalculator.factorial(3);
        Assertions.assertEquals(expextedResult, actualResult, "ERROR factorial!");

        // evitar problemas de creación sobre el mismo método estático
        objectMocked.close();
    }
}
