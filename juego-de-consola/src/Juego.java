import java.util.Scanner;

public class Juego {
    public static void main(String[] args) throws Exception {
        //scanner nos permite tomar lo q la persona escriba
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elegi un dia de la semana: ");
        System.out.println("1 - Lunes");
        System.out.println("2 - Martes");
        System.out.println("3 - Miercoles");
        System.out.println("4 - Jueves");
        System.out.println("5 - Viernes");

        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Productivo el pibe");
                break;
            case 2:
                System.out.println("Sos un bot");
                break;
            case 3:
                System.out.println("Cortaditaaa");
                break;
            case 4:
                System.out.println("Dia mundial de la educacion fisica");
                break;
            case 5:
                System.out.println("Sos un infiel");
                break;
            default:
                System.err.println("Dia invalido pete");
                break;
        }
        if (dia <= 5) {
            System.out.println("Sacala chupa verga");
        }
        scanner.close();
    }
}
