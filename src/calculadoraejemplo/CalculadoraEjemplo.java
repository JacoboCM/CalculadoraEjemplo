package calculadoraejemplo;
/**
 * La clase CalculadoraEjemplo implementa operaciones básicas.
 * Incluye métodos para suma, resta, multiplicación y división.
 *
 * @author Jacobo Javier Clemente Marrero
 * @version 1.0
 * @since 2024
 */
public class CalculadoraEjemplo {
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor para la clase CalculadoraEjemplo.
     *
     * @param operando1 primer operando para las operaciones.
     * @param operando2 segundo operando para las operaciones.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de los dos operandos.
     *
     * @return el resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los dos operandos.
     *
     * @return el resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los dos operandos.
     *
     * @return el resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los dos operandos.
     *
     * @return el resultado de la división.
     * @throws ArithmeticException si operando2 es cero.
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(10, 5);
        
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicacion: " + calculadora.multiplicar());
        
        try {
            System.out.println("Division: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Modificación para el segundo commit");
    }
}
*/