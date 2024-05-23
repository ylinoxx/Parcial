public class prestamoDis {
    private tabletGrafica tablet;
    private estudianteDis estudianteDiseno;
    public prestamoDis(estudianteDis estudianteDiseno, tabletGrafica tablet) {
        this.estudianteDiseno = estudianteDiseno;
        this.tablet = tablet;
    }
    public tabletGrafica getTablet() {
        return tablet;
    }
    public void setTablet(tabletGrafica tablet) {
        this.tablet = tablet;
    }
    public estudianteDis getEstudianteDiseno() {
        return estudianteDiseno;
    }
    public void setEstudianteDiseno(estudianteDis estudianteDiseno) {
        this.estudianteDiseno = estudianteDiseno;
    }
    public static prestamoDis DISinput(){
        System.out.println("Ingrese los datos del estudiante");
        estudianteDis estudiante = estudianteDis.EDinput();
        System.out.println("Ingrese los datos del computador portatil");
        tabletGrafica tablet = tabletGrafica.Tinput();
        return new prestamoDis(estudiante, tablet);
    }
    public String PtoString(){
        return estudianteDiseno.EDtoString() + tablet.TtoString();
    }
}
