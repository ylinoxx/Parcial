import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class registroArchivo {
    public void RA(int seleccion) {
        registroIngenieria RI = new registroIngenieria();
        registroEstudiantes RE = new registroEstudiantes();
        String nombreArchivo = "Registro_Computadores.txt";
        String contenidoAdicional = "";
        switch (seleccion) {
            case 1:
                contenidoAdicional = "\n" + RE.registroIng() +"\n"+ RI.registro();
                break;
            case 2:
                contenidoAdicional = "\n" + RE.registroDis() +"\n"+ RI.registroD();
                break;
        }
        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferEscritor = new BufferedWriter(escritorArchivo);
            bufferEscritor.write(contenidoAdicional);
            bufferEscritor.close();
            System.out.println("Registro realizado con exito :)");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al realizar el registro.");
            e.printStackTrace();
        }
    }
    public void mostrarArchivo(){
        String nombreArchivo = "Registro_Computadores.txt";
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferLector = new BufferedReader(lectorArchivo);
            String linea;
            while ((linea = bufferLector.readLine()) != null) {
                System.out.println(linea);
            }
            bufferLector.close();
        } catch (IOException e) {
            System.err.println("Ocurrió un error al mostrar el archivo.");
            e.printStackTrace();
        }
    }
}
