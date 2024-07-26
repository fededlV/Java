public class ClaseAbstracta {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8, 6);

        circulo.imprimirInfo();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInfo();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());  
    }
}
