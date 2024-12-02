package udla.dmolina.ejercicio1;

public class Diagnostico {
    private String fecha;
    private String descripcion;

    public Diagnostico(String fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        String s = "Diagnostico" + "\n"
                + "Fecha: " + fecha + "\t"
                + "Descripcion: "+descripcion;
        return s;
    }
}
