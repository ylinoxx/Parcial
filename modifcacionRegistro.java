import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class modifcacionRegistro {
    public void mod(int seleccion){
        String registroMod = "$", cedula = "$", serial = "$";
        registroIngenieria RI = new registroIngenieria();
        registroEstudiantes RE = new registroEstudiantes();
        Scanner in = new Scanner(System.in);
        String nombreArchivo = "Registro_Computadores.txt";
        System.out.println("1) Modificar registro por cedula");
        System.out.println("2) Modificar el registro por serial");
        int opcion = in.nextInt();
        in.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el numero de cedula");
                cedula = in.nextLine();
                break;
            case 2:
                System.out.println("Ingrese el serial");
                serial = in.nextLine();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        switch (seleccion) {
            case 1:
                registroMod = "\n" + RE.registroIng() +"\n"+ RI.registro();
                break;
            case 2:
                registroMod = "\n" + RE.registroDis() +"\n"+ RI.registroD();
                break;
            default:
                break;
        }
        List<String> lista = new LinkedList<String>();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferLector = new BufferedReader(lectorArchivo);
            String linea;
            while ((linea = bufferLector.readLine()) != null) {
                // Verificar si la línea contiene el contenido viejo y modificarla
                if (linea.contains(cedula)) {
                    linea = linea.replace(cedula, registroMod);
                    lista.add(linea);
                    break;
                } else if (linea.contains(serial)) {
                    linea = linea.replace(serial, registroMod);
                    lista.add(linea);
                    break;
                }
            }
            bufferLector.close();
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
        // Escribir el contenido modificado de vuelta al archivo
        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            BufferedWriter bufferEscritor = new BufferedWriter(escritorArchivo);
            for (String linea : lista) {
                bufferEscritor.write(linea);
                bufferEscritor.newLine();
            }
            bufferEscritor.close();
            System.out.println("La modificacion se ha realizado correctamente");
        } catch (IOException e) {
            System.err.println("Ocurrió un error con la modificacion.");
            e.printStackTrace();
        }
    }
}