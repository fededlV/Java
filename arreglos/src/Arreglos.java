public class Arreglos {
    public static void main(String[] args) throws Exception {
        int[] numeros = {1, 2, 3 , 4, 5};

        /* System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]); */

        for (int i : numeros) {
            System.out.println(i);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
