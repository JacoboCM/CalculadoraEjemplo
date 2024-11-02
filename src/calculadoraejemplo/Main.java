package calculadoraejemplo;
//Cambio para el segundo commit
/**
 *
 * @author Jacobo Javier Clemente Marrero
 * @version 1.0
 * @since 2024
 */

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
    }
}