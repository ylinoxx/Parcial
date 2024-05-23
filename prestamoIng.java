public class prestamoIng {
    private estudianteING estudiante;
    private computadorPortatil computador;
    public prestamoIng(estudianteING estudiante, computadorPortatil computador) {
        this.estudiante = estudiante;
        this.computador = computador;
    }
    public estudianteING getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(estudianteING estudiante) {
        this.estudiante = estudiante;
    }
    public computadorPortatil getComputador() {
        return computador;
    }
    public void setComputador(computadorPortatil computador) {
        this.computador = computador;
    }
    public static prestamoIng INGinput(){
        System.out.println("Ingrese los datos del estudiante");
        estudianteING estudiante = estudianteING.Einput();
        System.out.println("Ingrese los datos del computador portatil");
        computadorPortatil computador = computadorPortatil.Cinput();
        return new prestamoIng(estudiante, computador);
    }
    public String PtoString(){
        return estudiante.EtoString() + computador.CtoString();
    }
}
