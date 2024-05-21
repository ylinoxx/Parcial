import java.util.Scanner;

public class registroIngenieria {
    static Scanner in = new Scanner(System.in);
    public String registro(){
        sub_Menu sM = new sub_Menu(); 
        System.out.println("Ingrese el serial");
        String serial = in.nextLine();
        System.out.println("Ingrese la marca");
        String marca = in.nextLine();
        System.out.println("Ingrese el sistema operativo"); 
        String sistemaOp = sM.subSP();
        System.out.println("Ingrese el procesador");
        String procesador = sM.subP();
        System.out.println("Ingrese el tamaño (Pulgadas)");
        float tamano = in.nextFloat();
        System.out.println("Ingrese el precio");
        int precio = in.nextInt();
        computador_Portatil c = new computador_Portatil(serial, marca, sistemaOp, procesador, tamano, precio);
        String retorno = "serial: "+ c.getSerial() + "\n marca: "+ c.getMarca() + "\n sistema operativo: " + c.getSistemaOp() +
        "\n procesador: "+ c.getProcesador() +"\n tamaño: " + c.getTamano() +"in\n precio: "+ c.getPrecio() +"$";
        return retorno;
    }
    public String registroD(){
        sub_Menu sM = new sub_Menu(); 
        System.out.println("Ingrese el serial");
        String serial = in.nextLine();
        System.out.println("Ingrese la marca");
        String marca = in.nextLine();
        System.out.println("Ingrese el almacenamiento"); 
        String almacenamiento = sM.subTD();
        System.out.println("Ingrese el tamaño (Pulgadas)");
        float tamano = in.nextFloat();
        System.out.println("Ingrese el precio");
        int precio = in.nextInt();
        System.out.println("Ingrese el peso (Kg)");
        float peso = in.nextFloat();
        tablet_grafica tg = new tablet_grafica(serial, marca, almacenamiento, tamano, peso, precio);
        String retorno = "serial: "+ tg.getSerial() + "\n marca: "+ tg.getMarca() + "\n almacenamiento: " + tg.getAlmacenamiento() +"\n tamaño: " + 
        tg.getTamano() +"in\n precio: "+ tg.getPrecio() +"$\n peso: " + tg.getPeso() + "kg";
        return retorno;
    }
}
