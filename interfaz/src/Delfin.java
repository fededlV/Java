import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {
    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println("El delfín " + nombre + " nada en el agua.");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite un sonido para comunicarse");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come peces y calamares.");
    }
}
