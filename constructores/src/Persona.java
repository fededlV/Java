public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    // Constructor
    Persona() {
        carrera = new Carrera();
    }

    // Metodos
    String nombreCompleto() {
        return nombre + " " + apellido;
    }

    String saludo() {
        return "Hola, soy " + nombreCompleto();
    }
}
