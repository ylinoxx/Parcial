

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class devolucionPrestamo {
    public void devolucion(String nombreArchivo){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula o el serial del registro que desea eliminar");
        int cedula_serial = in.nextInt();
        in.nextLine();
        String cedula_serialString = Integer.toString(cedula_serial); 
        mostrarRegistros MR = new mostrarRegistros();
        List<prestamoIng> registros = MR.leerRegistros(nombreArchivo);
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (prestamoIng prestamoIng1 : registros) {
                if (!prestamoIng1.getEstudiante().getCedula().equals(cedula_serialString) || prestamoIng1.getComputador().getSerial().equals(cedula_serialString)) {
                    escritor.write(prestamoIng1.PtoString());
                    escritor.newLine();
                }
            }
            System.out.println("Registro eliminado");
        } catch (IOException e) {
            System.err.println("Error al modificar el registro");
            e.printStackTrace();
        }
    }
}
