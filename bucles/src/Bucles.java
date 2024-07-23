public class Bucles {
    public static void main(String[] args) throws Exception {
        // Ciclo for (inicializacio; condicion; actualizacion)
        int j;
        for (int i = 1; i <= 10; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("i: ");
                System.out.print(i);
                System.out.print(" j: ");
                System.out.println(j);

            }
        }

        int counter = 1;
        while (counter <= 10) {
            System.out.println("Counter: " + counter);
            //Actualizacion de la variable. 
            counter++;
        } 
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter <= 5);
     }
}
