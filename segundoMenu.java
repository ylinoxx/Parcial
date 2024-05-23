import java.util.Scanner;

public class segundoMenu {
    public void Menu(String nombreArchivo, String nombreArchivoDis, int seleccion){
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
                    crearRegistro nuevoRegistro = new crearRegistro();
                    if (seleccion == 1) {
                        prestamoIng nuevoPrestamo = prestamoIng.INGinput();
                        nuevoRegistro.registro(nuevoPrestamo, nombreArchivo);
                    } else {
                        prestamoDis nuevPrestamoDis = prestamoDis.DISinput();
                        nuevoRegistro.registroDis(nuevPrestamoDis, nombreArchivoDis);
                    }
                    break;
                case 2:
                    modificarRegistro mod = new modificarRegistro();
                    if (seleccion == 1) {
                        mod.modRegistro(nombreArchivo);
                    } else{
                        mod.modRegistroDis(nombreArchivoDis);
                    }
                    break;
                case 3:
                    devolucionPrestamo dv = new devolucionPrestamo();
                    if (seleccion == 1) {
                        dv.devolucion(nombreArchivo);
                    } else {
                        dv.devolucionDis(nombreArchivoDis);
                    }
                    break;
                case 4:
                    mostrarRegistros MR1 = new mostrarRegistros();
                    if (seleccion == 1) {
                        MR1.mostrar(nombreArchivo, true);
                    } else {
                        MR1.mostrarDis(nombreArchivoDis, bucle);
                    }
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
