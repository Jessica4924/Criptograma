public class DesencriptadorPorFuerzaBruta {
    Desencriptador desencriptador = new Desencriptador();

    String desencriptarPorFuerzaBruta(String textoEncriptado) {
        String textoPosiblementeDesencriptado = "nada por aqui";

        for (int i = 1; i < 10; i++){
            textoPosiblementeDesencriptado = desencriptador.desencriptar(textoEncriptado, i);

            boolean contienePalabraEnEspanol = contieneAlgunaPalabraEnEspanol(textoPosiblementeDesencriptado);
            if (contienePalabraEnEspanol){
                System.out.println("La clave es:" + i);
                System.out.println("Y el texto desencriptado es:" + textoPosiblementeDesencriptado);
            }
        }

        return textoPosiblementeDesencriptado;
    }
    boolean contieneAlgunaPalabraEnEspanol(String texto){
        String[] palabrasEnEspanol = new String[4];
        palabrasEnEspanol [0] = " de ";
        palabrasEnEspanol [1] = " en ";
        palabrasEnEspanol [2] = " el ";
        palabrasEnEspanol [3] = " la ";

        for (int i = 0; i < palabrasEnEspanol.length; i++){
            if (texto.contains(palabrasEnEspanol[i])){
                return true;
            }
        }
        return false;

    }
}
