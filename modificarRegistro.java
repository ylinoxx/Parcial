

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class modificarRegistro {
    public void modRegistro( String nombreArchivo){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula o el serial del registro que desea modificar");
        int cedula_serial = in.nextInt();
        in.nextLine();
        String cedula_serialString = Integer.toString(cedula_serial); 
        mostrarRegistros MR = new mostrarRegistros();
        List<prestamoIng> registros = MR.leerRegistros(nombreArchivo);
        boolean encontrado = false;
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (prestamoIng prestamoIng1 : registros) {
                if (prestamoIng1.getEstudiante().getCedula().equals(cedula_serialString) || prestamoIng1.getComputador().getSerial().equals(cedula_serialString)) {
                    System.out.println("Ingrese los nuevos datos del prestamo:");
                    prestamoIng Prestamonuevo = prestamoIng.INGinput();
                    prestamoIng1 = Prestamonuevo;
                    encontrado = true;
                }
                escritor.write(prestamoIng1.PtoString());
                escritor.newLine();
            }
            if (encontrado) {
                System.out.println("El registro ha sido modificado");
            } else{
                System.out.println("No se encontro el registro");
            }
        } catch (IOException e) {
            System.err.println("Error al modificar el registro");
            e.printStackTrace();
        }
    }
    public void modRegistroDis( String nombreArchivoDis){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula o el serial del registro que desea modificar");
        int cedula_serial = in.nextInt();
        in.nextLine();
        String cedula_serialString = Integer.toString(cedula_serial); 
        mostrarRegistros MR = new mostrarRegistros();
        List<prestamoDis> registros = MR.leerDis(nombreArchivoDis);
        boolean encontrado = false;
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoDis))) {
            for (prestamoDis prestamoDis1 : registros) {
                if (prestamoDis1.getEstudianteDiseno().getCedula().equals(cedula_serialString) || prestamoDis1.getTablet().getSerial().equals(cedula_serialString)) {
                    System.out.println("Ingrese los nuevos datos del prestamo:");
                    prestamoDis Prestamonuevo = prestamoDis.DISinput();
                    prestamoDis1 = Prestamonuevo;
                    encontrado = true;
                }
                escritor.write(prestamoDis1.PtoString());
                escritor.newLine();
            }
            if (encontrado) {
                System.out.println("El registro ha sido modificado");
            } else{
                System.out.println("No se encontro el registro");
            }
        } catch (IOException e) {
            System.err.println("Error al modificar el registro");
            e.printStackTrace();
        }
    }
}
