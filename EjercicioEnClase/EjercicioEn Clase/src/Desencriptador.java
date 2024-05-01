public class Desencriptador {
    RecorredorDeLetras recorredorDeLetras = new RecorredorDeLetras();
    String desencriptar(String textoEncriptado, int clave) {
        String textoDesencriptado = recorredorDeLetras.recorrerLetrasDePalabras(textoEncriptado, -clave);
        return textoDesencriptado;
    }
}
