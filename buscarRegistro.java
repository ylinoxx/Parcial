

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buscarRegistro {
    public List<prestamoIng> buscar(String nombreArchivo){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula o el serial del registro que desea buscar");
        int cedula_serial = in.nextInt();
        in.nextLine();
        String cedula_serialString = Integer.toString(cedula_serial); 
        List<prestamoIng> prestamos = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                if (linea.startsWith("Estudiante:")) {
                    String cedula = lector.readLine().split(": ")[1];
                    String nombre = lector.readLine().split(": ")[1];
                    String apellido = lector.readLine().split(": ")[1];
                    String telefono = lector.readLine().split(": ")[1];
                    int numeroSemestre = Integer.parseInt(lector.readLine().split(": ")[1]);
                    float promedioAcumulado = Float.parseFloat(lector.readLine().split(": ")[1]);
                    estudianteING estudiante = new estudianteING(cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado);
                    lector.readLine();
                    String serial = lector.readLine().split(": ")[1];
                    String marca = lector.readLine().split(": ")[1];
                    String sistemaOp = lector.readLine().split(": ")[1];
                    String procesador = lector.readLine().split(": ")[1];
                    float tamano = Float.parseFloat(lector.readLine().split(": ")[1]);
                    int precio = Integer.parseInt(lector.readLine().split(": ")[1]);
                    computadorPortatil computador = new computadorPortatil(serial, marca, sistemaOp, procesador, tamano, precio);
                    prestamoIng prestamo = new prestamoIng(estudiante, computador);
                    if (cedula.equals(cedula_serialString) || serial.equals(cedula_serialString)) {
                        prestamos.add(prestamo);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer los registros.");
            e.printStackTrace();
        }
        return prestamos;
    }
}
