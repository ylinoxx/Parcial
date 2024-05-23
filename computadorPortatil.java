

import java.util.Scanner;

public class computadorPortatil {
    private String serial, marca, sistemaOp, procesador;
    private float tamano;
    private int precio;
    public computadorPortatil(String serial, String marca, String sistemaOp,String procesador, float tamano, int precio) {
        this.serial = serial;
        this.marca = marca;
        this.sistemaOp = sistemaOp; 
        this.procesador = procesador;
        this.tamano = tamano;
        this.precio = precio;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSistemaOp() {
        return sistemaOp;
    }
    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public float getTamano() {
        return tamano;
    }
    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public static computadorPortatil Cinput(){
        Scanner in = new Scanner(System.in);
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
        in.nextLine();
        System.out.println("Ingrese el precio");
        int precio = in.nextInt();
        in.nextLine();
        return new computadorPortatil(serial, marca, sistemaOp, procesador, tamano, precio);
    }
    public String CtoString(){
        return "Computador_Prestado:" + "\nSerial: "+ serial + "\nMarca: " + marca + "\nSistema_operativo: " + sistemaOp + "\nProcesador: " + procesador + "\nTamano: " + tamano + "\nPrecio: " + precio;
    }
}
