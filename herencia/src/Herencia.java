public class Herencia {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Rocco", 10);
        Gato gato = new Gato("Michi", 5);
        Perro perro = new Perro("Garfield", 3);

        System.out.println("El animal llamado " + animal.nombre + " hace ");
        System.out.println(animal.hacerSonido());
        System.out.println("El gato llamado " + gato.nombre + " hace ");
        System.out.println(gato.hacerSonido());
        System.out.println("El perro llamado " + perro.nombre + " hace ");
        System.out.println(perro.hacerSonido());

        System.out.println("El numero de animales es: " + Animal.getContadorAnimales());
        System.out.println("El nombre de la veterinaria es: " + Veterinaria.nombre);
    }
}
