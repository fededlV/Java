import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) throws Exception {
            
            Set<String> superheroes = new LinkedHashSet<>();
            superheroes.add("Spiderman");
            superheroes.add("Naruto");
            superheroes.add("Sasuke");
            superheroes.add("Ricki");
            superheroes.add("Fedes");
    
            if (superheroes.contains("Spiderman")) {
                System.out.println("Spiderman is here");
            }
    
            superheroes.remove("Fedes");
    
            if(!superheroes.contains("Fedes")) {
                System.out.println("Fedes is not here");
            }
    
            superheroes.add("Pitos");
    
            if(superheroes.isEmpty()) {
                System.out.println("No superheroes here");
            } else {
                System.out.println("We have " + superheroes.size() + " superheroes");
            }
    
            System.out.println("We have the following superheroes still.");
            for (String superHeroe : superheroes) {
                System.out.println(superHeroe);
            }
    }
}
