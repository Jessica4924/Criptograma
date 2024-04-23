import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        //Menú para encriptar un archivo de texto
        do{
            System.out.println("Menú del Criptograma");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("3. Salir del programa");
            System.out.println("Digite la opción:  ");
            opcion = consola.nextInt();

            switch (opcion){
                case 1:
                    //llamar al método encriptar
                    Encriptar();
                    break;
                case 2:
                    //llamar al metodo desencriptar
                    Desencriptar();
                    break;
                case 3:
                    System.out.println("Ha salido exitosamente del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta, por favor seleccione una opción correcta");
                    break;


            }
        } while (opcion != 3);
        consola.close();
    }
}