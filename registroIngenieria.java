import java.util.Scanner;

public class registroIngenieria {
    public String registro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el serial");
        String serial = in.nextLine();
        System.out.println("Ingrese la marca");
        String marca = in.nextLine();
        System.out.println("Ingrese el sistema operativo"); // hacer sub menu
        String sistemaOp = in.nextLine();
        System.out.println("Ingrese el procesador"); // hacer sub menu
        String procesador = in.nextLine();
        System.out.println("Ingrese el tamaño (Pulgadas)");
        float tamaño = in.nextFloat();
        System.out.println("Ingrese el precio");
        int precio = in.nextInt();
        computador_Portatil c = new computador_Portatil(serial, marca, sistemaOp, procesador, tamaño, precio);
        String retorno = "serial: "+ c.getSerial() + "\n marca: "+ c.getMarca() + "\n sistema operativo: " + c.getSistemaOp() +"\n procesador: "+ c.getProcesador() +"\n tamaño: " + c.getTamaño() +"in\n precio: "+ c.getPrecio() +"$";
        return retorno;
    }
}
