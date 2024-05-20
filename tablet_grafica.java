public class tablet_grafica {
    String serial, marca, almacenamiento;
    float tamaño;
    int precio;
    public tablet_grafica(String serial, String marca, String almacenamiento, float tamaño, int precio) {
        this.serial = serial;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamaño = tamaño;
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
    public String getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}