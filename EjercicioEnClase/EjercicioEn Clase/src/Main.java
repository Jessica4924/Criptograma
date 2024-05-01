//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Encriptador encriptador = new Encriptador();
        String textoEncriptado = encriptador.encriptar("Jessica está en la casa", 1);
        System.out.println(textoEncriptado);

        DesencriptadorPorFuerzaBruta desencriptador = new DesencriptadorPorFuerzaBruta();
        desencriptador.desencriptarPorFuerzaBruta(textoEncriptado);
    }
}
