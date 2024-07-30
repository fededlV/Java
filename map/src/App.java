import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Double> inventario = new HashMap<>();

        inventario.put("Banana", 1.89);
        inventario.put("Tomate", 1.75);
        inventario.put("Papa", 1.00);
        inventario.put("Frutillita", 0.50);

        System.out.println("Inventario de la verdu pa");

        //keySet me da un arreglo de las llaves
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaBuscada = "Frutillita";
        System.out.println("Cliente pide: " + frutaBuscada);

        if(inventario.containsKey(frutaBuscada)) {
            System.out.println(frutaBuscada + " esta en el inventario");
        } else {
            System.out.println(frutaBuscada + " no esta en el inventario");
        }

        String sinStock = "Frutillita";
        inventario.remove(sinStock);
        System.out.println("Se acabo la: " + sinStock);

        System.out.println("Invertario actualizado");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }
        System.out.println("cantidad de mercaderia: " + inventario.size());
    }
}
