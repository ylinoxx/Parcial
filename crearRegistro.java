

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class crearRegistro {
    public void registro(prestamoIng Registro, String nombreArchivo){
        try (BufferedWriter escribir = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            escribir.write(Registro.PtoString());
            escribir.newLine();
            System.out.println("Registro creado");
        } catch (IOException e) {
            System.err.println("Error al crear el registro.");
            e.printStackTrace();
        }
    }
}
