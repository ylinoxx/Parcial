import java.util.Scanner;

public class tabletGrafica {
    private String serial, marca, almacenamiento;
    private float tamano, peso;
    private int precio;
    public tabletGrafica(String serial, String marca, String almacenamiento, float tamano, float peso, int precio) {
        this.serial = serial;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamano = tamano;
        this.precio = precio;
        this.peso = peso;
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
    public String getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public float getTamano() {
        return tamano;
    }
    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public static tabletGrafica Tinput(){
        Scanner in = new Scanner(System.in);
        sub_Menu sM = new sub_Menu(); 
        System.out.println("Ingrese el serial");
        String serial = in.nextLine();
        System.out.println("Ingrese la marca");
        String marca = in.nextLine();
        System.out.println("Ingrese el almacenamiento"); 
        String almacenamiento = sM.subTD();
        System.out.println("Ingrese el tamaño (Pulgadas)");
        float tamano = in.nextFloat();
        in.nextLine();
        System.out.println("Ingrese el precio");
        int precio = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese el peso (Kg)");
        float peso = in.nextFloat();
        in.nextLine();
        return new tabletGrafica(serial, marca, almacenamiento, tamano, peso, precio);
    }
    public String TtoString(){
        return "Tablet_Prestada:" + "\nSerial: "+ serial + "\nMarca: " + marca + "\nAlmacenamiento: " + almacenamiento + "\nTamano: " + tamano + "\nPeso: " + peso + "\nPrecio: " + precio;
    }
}
