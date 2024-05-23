import java.util.Scanner;

public class estudianteDis {
    private int cantAsignaturas;
    private String cedula, nombre, apellido, telefono, modalidadEst;
    public estudianteDis(String cedula, String nombre, String apellido, String telefono, String modalidadEst, int cantAsignaturas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidadEst = modalidadEst;
        this.cantAsignaturas = cantAsignaturas;
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
    public static estudianteDis EDinput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del estudiante");
        String cedula = in.nextLine();
        System.out.println("Ingrese el nombre del estudiante"); 
        String nombre = in.nextLine();
        System.out.println("Ingrese el apellido del estudiante"); 
        String apellido = in.nextLine();
        System.out.println("Ingrese el telefono del estudiante");
        String telefono = in.nextLine();
        System.out.println("Ingrese la modalidad de estudio");
        String modalidadEst = in.nextLine();
        System.out.println("Ingrese la cantidad de asignaturas que esta viendo");
        int cantAsignaturas = in.nextInt();
        in.nextLine();
        return new estudianteDis(cedula, nombre, apellido, telefono, modalidadEst, cantAsignaturas);
    }
    public String EDtoString(){
        return  "Estudiante:" + "\nCedula: "+cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nModalidad_estudiante: " + modalidadEst + "\nCantidad_asignaturas: " + cantAsignaturas + "\n";
    }
}
