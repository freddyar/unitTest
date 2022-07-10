package exampleMock;

/**
 * @author freddyar
 */
public class CalculatorAvanzada {

    private Multiplica multiplica;

    public CalculatorAvanzada() {
        multiplica = new Multiplica();
    }

    /**
     *  Para empezar un mock necesitamos un método de seteo de la clase (Dependencia del métodos)
     *  step 1
     *  */
    public void setMultiplica(Multiplica multiplica) {
        this.multiplica = multiplica;
    }

    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = multiplica.mult(fact, i);
        }

        return fact;
    }
}
