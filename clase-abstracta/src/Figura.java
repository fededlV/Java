public abstract class Figura {
    //Este comportamiento es obligatorio para todas las clases que hereden de Figura
    abstract double calcularArea();

    void imprimirInfo(){
        System.out.println("Esta info viene de figura");
    }

}
