public class computador_Portatil {
    private String serial, marca, sistemaOp, procesador;
    private float tamano;
    private int precio;
    public computador_Portatil(String serial, String marca, String sistemaOp,String procesador, float tamano, int precio) {
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
    public void setTamaño(float tamaño) {
        this.tamano = tamaño;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
