public class Controles {
    public static void main(String[] args) throws Exception {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break; //corta el bucle directamente 
                //continue saltea las siguientes lineas de codigo y vuelve a empezar el bucle
            }
            System.out.println(i);
        }
    }
}
