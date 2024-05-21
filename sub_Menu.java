import java.util.Scanner;

public class sub_Menu {
    static Scanner in = new Scanner(System.in);
    public String subSP(){
        String sistemaOperativo = " ";
        int seleccion;
        do {
            System.out.println("Porfavor elija cual es el sistema operativo");
            System.out.println("1) Windows 7 \n"+
            "2) Windows 10 \n"+
            "3) Windows 11");
            seleccion = in.nextInt();
            in.nextLine();
            switch (seleccion) {
                case 1:
                    System.out.println("Ha seleccionado Windows 7");
                    sistemaOperativo = "Windows 7";
                    break;
                case 2:
                    System.out.println("Ha seleccionado Windows 10");
                    sistemaOperativo = "Windows 10";
                    break;
                case 3:
                    System.out.println("Ha seleccionado Windows 11");
                    sistemaOperativo = "Windows 11";
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion que sea valida");
                    break;
            }
        } while (sistemaOperativo != "Windows 7" && sistemaOperativo != "Windows 11" && sistemaOperativo != "Windows 10");
        return sistemaOperativo;
    }
    public String subP(){
        String procesador = " ";
        int seleccion;
        do {
            System.out.println("Porfavor elija cual es el sistema operativo");
            System.out.println("1) AMD Ryzen. \n"+
            "2) Intel® Core™ ¡5.");
            seleccion = in.nextInt();
            in.nextLine();
            switch (seleccion) {
                case 1:
                    System.out.println("Ha seleccionado AMD Ryzen.");
                    procesador = "AMD Ryzen.";
                    break;
                case 2:
                    System.out.println("Ha seleccionado Intel® Core™ ¡5.");
                    procesador = "Intel® Core™ ¡5.";
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion que sea valida");
                    break;
            }
        } while (procesador != "AMD Ryzen." && procesador != "Intel® Core™ ¡5.");
        return procesador;
    }
    public String subTD(){
        String almacenamiento = " ";
        int seleccion;
        do {
            System.out.println("Porfavor elija cual es el sistema operativo");
            System.out.println("1) 256 GB \n"+
            "2) 512 GB \n"+ 
            "3) 1 TB");
            seleccion = in.nextInt();
            in.nextLine();
            switch (seleccion) {
                case 1:
                    System.out.println("Ha seleccionado 256 GB");
                    almacenamiento = "256 GB";
                    break;
                case 2:
                    System.out.println("Ha seleccionado 512 GB");
                    almacenamiento = "512 GB";
                    break;
                case 3:
                    System.out.println("Ha seleccionado 1 TB");
                    almacenamiento = "1 TB";
                default:
                    System.out.println("Porfavor ingrese una opcion que sea valida");
                    break;
            }
        } while (almacenamiento != "256 GB" && almacenamiento != "512 GB" && almacenamiento != "1 TB");
        return almacenamiento;
    }
}
