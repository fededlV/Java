public class Constructores {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Fede";
        persona1.apellido = "de la Vega";
        persona1.edad = 20;
        persona1.carrera.nombre = "Ingenieria en Sistemas";
        

        /* Persona persona2 = new Persona();
        persona2.nombre = "Ana Sol";
        persona2.apellido = "Robledo";
        persona2.edad = 21; */
        //persona2.carrera = carrera1;

        System.out.println(persona1.nombreCompleto() + " tiene " + persona1.edad + " años y esta estudiando " + persona1.carrera.nombre + ".");
        //System.out.println(persona2.nombreCompleto() + " tiene " + persona2.edad + " años.");

        
    }
}
