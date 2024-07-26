public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    //Con @Override se indica que se esta sobreescribiendo un metodo de la clase padre
    @Override
    public String hacerSonido() {
        return "Guau";
    }

}
