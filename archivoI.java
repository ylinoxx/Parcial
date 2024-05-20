import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class archivoI {
    public void archivo(){
        String nombreArchivo = "Registro_Computadores.txt";
        String contenido = "";
        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(escritorArchivo);
            bufferEscritor.write(contenido);
            bufferEscritor.close();
        } catch (IOException e) {
            System.err.println("Ocurrió un error al crear o escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
