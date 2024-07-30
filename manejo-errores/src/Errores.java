import Exceptions.CalculadoraException;


public class Errores {
    public static void main(String[] args) throws Exception {
        
        // Exceptions unchecked y checked

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

               
        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);
        } catch (CalculadoraException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Operación terminada");
        }
    }

}
