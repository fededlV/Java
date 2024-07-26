public class Encapsulamiento {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Federico", 20, "de la Vega");

        persona1.setNombre("Sol");
        persona1.setApellido("Robledo"); 

        System.out.println(persona1.nombreCompleto() + " tiene " + persona1.getEdad() + " años.") ;
    }
}
