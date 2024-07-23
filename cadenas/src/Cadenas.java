public class Cadenas {
    public static void main(String[] args) throws Exception {
        String texto = "Este es un texto";
        System.out.println(texto);

        //Longitud de la cadena 
        int longitud = texto.length();
        System.out.println(longitud);

        //Obtener un caracter de la cadena
        char caracter = texto.charAt(0);
        System.out.println(caracter);

        //Obtener un substring
        String subcadena = texto.substring(0, 4);
        System.out.println(subcadena);

        //Transformar todo a minuscula 
        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        //Transformar todo a mayuscula
        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        //Buscar indice 
        int indice = texto.indexOf("texto");
        System.out.println(indice);

        //Reemplazar texto
        String reemplazo = texto.replace("texto", "cadena");
        System.out.println(reemplazo);

        //Contiene una palabra 
        boolean contiene = texto.contains("Este");
        System.out.println("Contiene la palabra: " + contiene);

        //Sacar los espacios del principio y final
        String sinEspacios = texto.trim();
        System.out.println(sinEspacios);

    }
}
