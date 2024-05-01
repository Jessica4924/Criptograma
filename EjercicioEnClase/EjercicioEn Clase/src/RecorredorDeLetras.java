public class RecorredorDeLetras {
    private char recorrerLetra(char letraSinEncriptar, int clave){
        int codigoDeLetraEncriptada = letraSinEncriptar + clave;
        char letraEncriptada = (char) codigoDeLetraEncriptada;
        return letraEncriptada;
    }
    String recorrerLetrasDePalabras(String textoOriginal, int clave){
        StringBuilder creadorDeCadena = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char caracterSinEncriptar = textoOriginal.charAt(i);
            char letraEncriptada = recorrerLetra(caracterSinEncriptar, clave);
            creadorDeCadena.append(letraEncriptada);
        }

        String textoEncriptado = creadorDeCadena.toString();
        return textoEncriptado;
    }
}
