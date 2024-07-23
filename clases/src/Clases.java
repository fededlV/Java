public class Clases {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Fede";
        persona1.apellido = "de la Vega";
        persona1.edad = 20;
        
        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingenieria en Sistemas";
        carrera1.duracion = 5;
        carrera1.estaEnCurso = true;
        
        persona1.carrera = carrera1;

        
        Persona persona2 = new Persona();
        persona2.nombre = "Ana Sol";
        persona2.apellido = "Robledo"; 
        persona2.edad = 21;
        persona2.carrera = carrera1;


        System.out.println(persona1.nombreCompleto());
        System.out.println(persona2.nombreCompleto() + " tiene " + persona2.edad + " años.");
        
        System.out.println(persona1.saludo());
        System.out.println(persona2.saludo());

        System.out.println(persona1.nombre + " estudia " + persona1.carrera.nombre);
        System.out.println(persona2.nombre + " estudia " + persona2.carrera.nombre);
    }
}
