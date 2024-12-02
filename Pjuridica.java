package udla.dmolina.ejercicio1;

public class Pjuridica extends Persona{
    private String CIF;

    public Pjuridica(String email, String direccion, String telefono) {
        super(email, direccion, telefono);
        this.CIF = CIF;
    }

    public String getCIF() {
        return CIF;
    }

    @Override
    public String toString() {
        String s = "Juridica " +super.toString()
                + "\t"+"CIF: "+CIF;
        return s;
    }
}
