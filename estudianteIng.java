import java.util.Scanner;

public class estudianteING {
    private int numeroSemestre;
    private String cedula, nombre, apellido, telefono;
    private float promedioAcum;
    public estudianteING(String cedula, String nombre, String apellido, String telefono, int numeroSemestre,  float promedioAcum) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.numeroSemestre = numeroSemestre;
        this.promedioAcum = promedioAcum;
    }
    public int getNumeroSemestre() {
        return numeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    public static estudianteING Einput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del estudiante");
        String cedula  = in.nextLine();
        System.out.println("Ingrese el nombre del estudiante"); 
        String nombre = in.nextLine();
        System.out.println("Ingrese el apellido del estudiante"); 
        String apellido = in.nextLine();
        System.out.println("Ingrese el telefono del estudiante");
        String telefono = in.nextLine();
        System.out.println("Ingrese el numero del semestre actualmente cursado por el estudiante");
        int semestre = in.nextInt();
        System.out.println("Ingrese el promedio acumulado");
        float promedio = in.nextFloat();
        return new estudianteING(cedula, nombre, apellido, telefono, semestre, promedio);
    }
    public String EtoString(){
        return  "Estudiante:" + "\nCedula: "+cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nNumero_semestre: " + numeroSemestre + "\nPromedio_acumulado: " + promedioAcum + "\n";
    }
}
