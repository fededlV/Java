public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    // Constructor
    Persona(String nombre, String apellido, int edad, String nomCarrera, int duracion, boolean estaEnCurso) {
        carrera = new Carrera(nomCarrera, duracion, estaEnCurso);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nomCarrera;


    }

    // Metodos
    String nombreCompleto() {
        return nombre + " " + apellido;
    }

    String saludo() {
        return "Hola, soy " + nombreCompleto();
    }
}
