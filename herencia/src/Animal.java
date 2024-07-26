public class Animal {
    String nombre;
    int edad;
    //static
    static int contadorAnimales = 0;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido() {
        return "Hago un sonido";
    }

    public static int getContadorAnimales() {
        return contadorAnimales;
    }
}
