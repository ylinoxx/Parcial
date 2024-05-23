import java.util.Scanner;

public class mainPrestamo {
    public static void main(String[] args) {
        String nombreArchivo = "Registro_Prestamo.txt";
        String nombreArchivoDis = "Registro_PrestamoDis.txt";
        creacionArchivo archivo = new creacionArchivo();
        archivo.archivoDis(nombreArchivoDis);
        archivo.archivo(nombreArchivo);
        while (true) {
            Scanner  in = new Scanner(System.in);
            int seleccion;
            System.out.println(" --------------------------------");
            System.out.println("|         Menu principal         |");
            System.out.println("|--------------------------------|");
            System.out.println("| 1) -> Estudiante de ingenieria |");
            System.out.println("| 2) -> Estudiante de diseño     |");
            System.out.println("| 3) -> Inventario total         |");
            System.out.println("| 4) -> Salir del sistema        |");
            System.out.println(" --------------------------------");
            seleccion = in.nextInt();
            in.nextLine();
            switch (seleccion) {
                case 1: case 2:
                    segundoMenu Sm = new segundoMenu();
                    Sm.Menu(nombreArchivo, nombreArchivoDis, seleccion);   
                    break;
                case 3:
                    mostrarRegistros MR = new mostrarRegistros();
                    MR.mostrar(nombreArchivo, false);
                    MR.mostrarDis(nombreArchivoDis, false);
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
}
