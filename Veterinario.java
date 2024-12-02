package udla.dmolina.ejercicio1;

public class Veterinario extends Personal{
    public Veterinario(String nombre, String apellido, String fechaContratacion) {
        super(nombre, apellido, fechaContratacion);
    }

    @Override
    public String toString() {
        return "Veterinario: " + super.toString();
    }
}
