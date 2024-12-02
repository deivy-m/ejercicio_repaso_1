package udla.dmolina.ejercicio1;

public class Auxiliar extends Personal{
    public Auxiliar(String nombre, String apellido, String fechaContratacion) {
        super(nombre, apellido, fechaContratacion);
    }

    @Override
    public String toString() {
        return "Auxiliar" + super.toString();
    }
}
