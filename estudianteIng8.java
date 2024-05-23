public class estudianteIng8 {
    private int numeroSemestre;
    private String cedula, nombre, apellido, telefono;
    private float promedioAcum;
    public estudianteIng8(String cedula, int numeroSemestre, String nombre, String apellido, String telefono, float promedioAcum) {
        this.cedula = cedula;
        this.numeroSemestre = numeroSemestre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.promedioAcum = promedioAcum;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getNumeroSemestre() {
        return numeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
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
    public float getPromedioAcum() {
        return promedioAcum;
    }
    public void setPromedioAcum(float promedioAcum) {
        this.promedioAcum = promedioAcum;
    }
}
