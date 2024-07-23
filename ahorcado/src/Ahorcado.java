import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "river";
        int intentosMax = 10;
        int intentos = 0;
        boolean isAccerted = false;

        // Arreglos
        char[] letrasCorrect = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasCorrect.length; i++) {
            letrasCorrect[i] = '_';
        }

        while (!isAccerted && intentos < intentosMax) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasCorrect) + "(" + palabraSecreta.length() + " letras)" ); //string.valueof se usa cuando tenemos una palabra de chars

            System.out.println("Introduce una letra: ");
            // Obtenemos la letra que el usuario escribio
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra) {
                    letrasCorrect[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta, intentos restantes: " + (intentosMax - intentos) + " intentos");
            }

            if (String.valueOf(letrasCorrect).equals(palabraSecreta)) {
                isAccerted = true;
                System.out.println("Felicidades, has adivinado la palabra: " + palabraSecreta);
            }
        }
        if(!isAccerted) {
            System.out.println("Lo siento, has perdido, la palabra era: " + palabraSecreta);
        }
        scanner.close();
    }
}
