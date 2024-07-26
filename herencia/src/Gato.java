// Clase Gato que hereda de Animal
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        // con super se indica que se esta heredando de la clase padre
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

}
