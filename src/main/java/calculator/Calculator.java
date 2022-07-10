package calculator;

/**
 * @author freddyar
 */
public class Calculator {

    public Calculator() {
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) throws InterruptedException {
        Thread.sleep(6000);
        return a * b;
    }
}
