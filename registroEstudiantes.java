import java.util.Scanner;

public class registroEstudiantes {
    static Scanner in = new Scanner(System.in);
    public String registroIng(){
        String cedula = in.nextLine();
        System.out.println("Ingrese el numero de cedula del estudiante");
        cedula = in.nextLine();
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
        estudianteIng8 EI = new estudianteIng8(cedula, semestre, nombre, apellido, telefono, promedio);
        String retorno = "cedula: "+ EI.getCedula() + "\n nombre: "+ EI.getNombre() + "\n apellido: " + EI.getApellido() +
        "\n telefono: " + EI.getTelefono() +"\n numero semestre actualmente cursado: "+ EI.getNumeroSemestre() +"\n promedio: " +
        EI.getPromedioAcum();
        return retorno;
    }
    public String registroDis(){
        String cedula = in.nextLine();
        System.out.println("Ingrese el numero de cedula del estudiante");
        cedula = in.nextLine();
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
        estudianteDis ED = new estudianteDis(cedula, cantAsignaturas, nombre, apellido, telefono, modalidadEst);
        String retorno = "cedula: "+ ED.getCedula() + "\n nombre: "+ ED.getNombre() + "\n apellido: " + ED.getApellido() +
        "\n telefono: " + ED.getTelefono() +"\n modalidad de estudio: "+ ED.getModalidadEst() +"\n cantidad asignaturas que esta viendo: " +
        ED.getCantAsignaturas();
        return retorno;
    }
}
