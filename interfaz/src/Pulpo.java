import interfaces.Alimentable;
import interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable {
    public Pulpo(String nombre) {
        super(nombre);
    } 

    @Override
    void nadar() {
        System.out.println("El pulpo " + nombre + " nada en el agua.");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite un saludo para saludarse xdxd");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come peces y crustáceos.");
    }
}
