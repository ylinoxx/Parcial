public class estudianteDis {
    private int cantAsignaturas;
    private String cedula, nombre, apellido, telefono, modalidadEst;
    public estudianteDis(String cedula, int cantAsignaturas, String nombre, String apellido, String telefono, String modalidadEst) {
        this.cedula = cedula;
        this.cantAsignaturas = cantAsignaturas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidadEst = modalidadEst;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getCantAsignaturas() {
        return cantAsignaturas;
    }
    public void setCantAsignaturas(int cantAsignaturas) {
        this.cantAsignaturas = cantAsignaturas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getModalidadEst() {
        return modalidadEst;
    }
    public void setModalidadEst(String modalidadEst) {
        this.modalidadEst = modalidadEst;
    }
}
