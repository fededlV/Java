public abstract class CriaturasMarinas {
    String nombre;

    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    // esto obliga a las clases que hereden de CriaturasMarinas a implementar el método nadar
    abstract void nadar();
}
