public class mainP {
    public static void main(String[] args) {
        int seleccion = 1;
        archivoI creararchivo = new archivoI();
        creararchivo.archivo();
        registroArchivo registroDelContenido = new registroArchivo();
        registroDelContenido.RA(seleccion);
    }
}
