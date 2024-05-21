public class tablet_grafica {
    private String serial, marca, almacenamiento;
    private float tamano, peso;
    private int precio;
    public tablet_grafica(String serial, String marca, String almacenamiento, float tamano, float peso, int precio) {
        this.serial = serial;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamano = tamano;
        this.precio = precio;
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
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
    public void setTamano(float tamaño) {
        this.tamano = tamaño;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}