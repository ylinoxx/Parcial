import java.util.Scanner;

public class segundoMenu {
    public void Menu(String nombreArchivo){
        Scanner in = new Scanner(System.in);
        int seleccionM2;
        boolean bucle = true;
        while (bucle) {
            System.out.println(" ------------------------------------");
            System.out.println("|               Menu                 |");
            System.out.println("|------------------------------------|");
            System.out.println("| 1) -> Registrar prestamo de equipo |");
            System.out.println("| 2) -> Modificar prestamo de equipo |");
            System.out.println("| 3) -> Devolucion de equipo         |");
            System.out.println("| 4) -> Buscar equipo                |");
            System.out.println("| 5) -> Volver al menu principal     |");
            System.out.println(" ------------------------------------");
            seleccionM2 = in.nextInt();
            in.nextLine();
            switch (seleccionM2) {
                case 1:
                    prestamoIng nuevoPrestamo = prestamoIng.INGinput();
                    crearRegistro nuevoRegistro = new crearRegistro();
                    nuevoRegistro.registro(nuevoPrestamo, nombreArchivo);
                    break;
                case 2:
                    modificarRegistro mod = new modificarRegistro();
                    mod.modRegistro(nombreArchivo);
                    break;
                case 3:
                    devolucionPrestamo dv = new devolucionPrestamo();
                    dv.devolucion(nombreArchivo);
                    break;
                case 4:
                    mostrarRegistros MR1 = new mostrarRegistros();
                    MR1.mostrar(nombreArchivo, true);
                    break;
                case 5:
                    bucle = false;
                    break;
                default:
                    System.out.println("Porfavor escoja una opcion que sea valida");
                    break;
            }
        }
    }
}
