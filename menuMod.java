import java.util.Scanner;

public class menuMod {
    public void menu(int seleccion){
        Scanner in = new Scanner(System.in);
        int seleccionM2;
        while (true) {
            System.out.println("Menu");
            System.out.println("1) Registrar prestamo de equipo");
            System.out.println("2) Modificar prestamo de equipo");
            System.out.println("3) Devolucion de equipo");
            System.out.println("4) Buscar equipo");
            System.out.println("5) Volver al menu principal");
            seleccionM2 = in.nextInt();
            in.nextLine();
            switch (seleccionM2) {
                case 1:
                    archivoI creararchivo = new archivoI();
                    creararchivo.archivo();
                    registroArchivo registroDelContenido = new registroArchivo();
                    registroDelContenido.RA(seleccion);
                    break;
                case 2:
                    modifcacionRegistro MR = new modifcacionRegistro();
                    MR.mod(seleccion);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Porfavor escoja una opcion que sea valida");
                    break;
            }
        }
    }
}
