package udla.dmolina.ejercicio1;

public class Personal {
    private String nombre;
    private String apellido;
    private String fechaContratacion;

    public Personal(String nombre, String apellido, String fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                '}';
    }
}

