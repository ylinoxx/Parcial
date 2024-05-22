import java.util.Scanner;

public class mainP {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int seleccion = 0;
        System.out.println("Menu principal");
        System.out.println("1) Estudiante de ingenieria");
        System.out.println("2) Estudiante de diseño");
        System.out.println("3) Inventario total");
        System.out.println("4) Salir del sistema");
        seleccion = in.nextInt();
        in.nextLine();
        switch (seleccion) {
            case 1: case 2:
                menuMod mm = new menuMod();
                mm.menu(seleccion);     
                break;
            case 3:
                registroArchivo registroDelContenido = new registroArchivo();
                registroDelContenido.mostrarArchivo();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
