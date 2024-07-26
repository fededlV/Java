public class Constructores {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Fede", "de la Vega", 20, "Ingenieria en Sistemas", 5, true);
        
        /* Persona persona2 = new Persona();
        persona2.nombre = "Ana Sol";
        persona2.apellido = "Robledo";
        persona2.edad = 21; */
        //persona2.carrera = carrera1;

        System.out.println(persona1.nombreCompleto() + " tiene " + persona1.edad + " años y esta estudiando " + persona1.carrera.nombre + ".");
        //System.out.println(persona2.nombreCompleto() + " tiene " + persona2.edad + " años.");

        
    }
}
