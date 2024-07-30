import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Naruto");
        superHeroes.add("Penes");
        superHeroes.add("Sasuke");
        superHeroes.add("Ricki");
        superHeroes.add("Fedes");
        
        superHeroes.add("Penes");

        if (superHeroes.contains("Spiderman")){
            System.out.println("Spiderman is here");
        }

        superHeroes.set(2, "De negro");

        System.out.println("El gil este se fue: " + superHeroes.get(5));
        superHeroes.remove(5);

        if (!superHeroes.contains("Fedes")){
            System.out.println("Fedes is not here");
        }

        superHeroes.add("Pitos");
        superHeroes.add("Pitos");


        if (superHeroes.isEmpty()){
            System.out.println("No superheroes here");
        } else {
            System.out.println("We have " + superHeroes.size() + " superheroes");
        }
        
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }


    }
}
