package udla.dmolina.ejercicio1;

public class Persona {
    private String email;
    private String direccion;
    private String telefono;

    public Persona(String email, String direccion, String telefono) {
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }


    public String getTelefono() {
        return telefono;
    }



    @Override
    public String toString() {
        String s = "email: " + email
                + "\t" + "direccion: " + direccion
                + "\t" + "telefono: " + telefono;
        return s;
    }
}
