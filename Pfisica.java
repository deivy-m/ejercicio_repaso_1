package udla.dmolina.ejercicio1;

public class Pfisica extends Persona{
    private String DNI;


    public Pfisica(String email, String direccion, String telefono) {
        super(email, direccion, telefono);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        String s = "Fisica " + super.toString()
                + "\t" + "DNI: " + DNI;

        return s;
    }
}
