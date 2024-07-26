package interfaces;

public interface Comunicable {
    // Las variables en una interfaz son constantes
    //Estas interfaces pueden tener variables constantes, estaticas o finales
    final String grito = "¡Hola!";

    // La clase que implemente esta interfaz debe implementar este método
    void comunicarse();
}
