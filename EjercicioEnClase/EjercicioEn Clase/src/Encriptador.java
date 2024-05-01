public class Encriptador {
    RecorredorDeLetras recorredorDeLetras = new RecorredorDeLetras();

    String encriptar(String textoSinEncriptar, int clave){
        String textoEncriptado = recorredorDeLetras.recorrerLetrasDePalabras(textoSinEncriptar, clave);
        return textoEncriptado;
    }
}


