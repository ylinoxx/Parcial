import java.io.File;
import java.io.IOException;

public class creacionArchivo {
    public void archivo(String nombreArchivo){
        File archivoFile = new File(nombreArchivo);
        try {
            archivoFile.createNewFile();
        } catch (IOException e) {
            System.err.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
    public void archivoDis(String nombreArchivoDis){
        File archivoFile = new File(nombreArchivoDis);
        try {
            archivoFile.createNewFile();
        } catch (IOException e) {
            System.err.println("Ocurrio un error al crear el archivo.");
        }
    }
}
