public class Estructuras {
    public static void main(String[] args) throws Exception {
        //If else 
        int edad = 18;
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad == 18) {
            System.out.println("Tenes 18 años");
        } else {
            System.out.println("Eres menor de edad");
        }

        //Switch 
        //Que dia de la semana te gusta?
        String dia = "Viernes" ;
        switch (dia) {
            case "Lunes":
                System.out.println("Me gusta el lunes");
                break;
            case "Martes":
                System.out.println("Dia bien de bot el martes");
                break;
            case "Miercoles":
                System.out.println("Buena cortada de semana");
                break;
            case "Jueves":
                System.out.println("Dia mundial de la educacion fisica");
                break;
        
            default:
            System.out.println("No te gusta nada gil de goma");
                break;
        }
    }
}
