

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mostrarRegistros {
    public List<prestamoIng> leerRegistros(String nombreArchivo) {
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
                    prestamos.add(prestamo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer los registros.");
            e.printStackTrace();
        }
        return prestamos;
    }
    public void mostrar(String nombreArchivo, boolean buscar){
        List<prestamoIng> registro = new ArrayList<>();
        if (buscar) {
            buscarRegistro BR = new buscarRegistro();
            registro = BR.buscar(nombreArchivo);
        }else{
            registro = leerRegistros(nombreArchivo);
        }
        for (prestamoIng prestamoIng : registro) {
            System.out.println("Cedula: "+ prestamoIng.getEstudiante().getCedula());
            System.out.println("Nombre: "+ prestamoIng.getEstudiante().getNombre());
            System.out.println("Apellido: "+ prestamoIng.getEstudiante().getApellido());
            System.out.println("Telefono: "+ prestamoIng.getEstudiante().getTelefono());
            System.out.println("Numero Semestre: "+ prestamoIng.getEstudiante().getNumeroSemestre());
            System.out.println("Promedio Acumulado: "+ prestamoIng.getEstudiante().getPromedioAcum());
            System.out.println("Serial: "+ prestamoIng.getComputador().getSerial());
            System.out.println("Marca: "+ prestamoIng.getComputador().getMarca());
            System.out.println("Sistema Operativo: "+ prestamoIng.getComputador().getSistemaOp());
            System.out.println("Procesador: "+ prestamoIng.getComputador().getProcesador());
            System.out.println("Tamaño: "+ prestamoIng.getComputador().getTamano());
            System.out.println("Precio: "+ prestamoIng.getComputador().getPrecio());
            System.out.println("\n");
        }
    }
    public List<prestamoDis> leerDis(String nombreArchivoDis){
        List<prestamoDis> prestamos = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivoDis))) {
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
                    String modalidadEst = lector.readLine().split(": ")[1];
                    int cantAsignaturas = Integer.parseInt(lector.readLine().split(": ")[1]);
                    estudianteDis estudiante = new estudianteDis(cedula, nombre, apellido, telefono, modalidadEst, cantAsignaturas);
                    lector.readLine();
                    String serial = lector.readLine().split(": ")[1];
                    String marca = lector.readLine().split(": ")[1];
                    String almacenamiento = lector.readLine().split(": ")[1];
                    float tamano = Float.parseFloat(lector.readLine().split(": ")[1]);
                    int precio = Integer.parseInt(lector.readLine().split(": ")[1]);
                    int peso = Integer.parseInt(lector.readLine().split(": ")[1]);
                    tabletGrafica tablet = new tabletGrafica(serial, marca, almacenamiento, tamano, peso, precio);
                    prestamoDis prestamo = new prestamoDis(estudiante, tablet);
                    prestamos.add(prestamo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer los registros.");
            e.printStackTrace();
        }
        return prestamos;
    }
    public void mostrarDis(String nombreArchivoDis, boolean buscar){
        List<prestamoDis> registro = new ArrayList<>();
        if (buscar) {
            buscarRegistro BR = new buscarRegistro();
            registro = BR.buscarDis(nombreArchivoDis);
        }else{
            registro = leerDis(nombreArchivoDis);
        }
        for (prestamoDis prestamoDis : registro) {
            System.out.println("Cedula: "+ prestamoDis.getEstudianteDiseno().getCedula());
            System.out.println("Nombre: "+ prestamoDis.getEstudianteDiseno().getNombre());
            System.out.println("Apellido: "+ prestamoDis.getEstudianteDiseno().getApellido());
            System.out.println("Telefono: "+ prestamoDis.getEstudianteDiseno().getTelefono());
            System.out.println("Modalidad Estudio: "+ prestamoDis.getEstudianteDiseno().getModalidadEst());
            System.out.println("Cantidad Asignaturas: "+ prestamoDis.getEstudianteDiseno().getCantAsignaturas());
            System.out.println("Serial: "+ prestamoDis.getTablet().getSerial());
            System.out.println("Marca: "+ prestamoDis.getTablet().getMarca());
            System.out.println("Almacenamiento: "+ prestamoDis.getTablet().getAlmacenamiento());
            System.out.println("Peso: "+ prestamoDis.getTablet().getPeso());
            System.out.println("Tamaño: "+ prestamoDis.getTablet().getTamano());
            System.out.println("Precio: "+ prestamoDis.getTablet().getPrecio());
            System.out.println("\n");
        }
    }
}
