public class Interfaz {
    public static void main(String[] args) throws Exception {
        Delfin delfin = new Delfin("Fedel");
        Pulpo pulpo = new Pulpo("Armani");

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();
        
    }
}
