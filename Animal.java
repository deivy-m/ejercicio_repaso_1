package udla.dmolina.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String tipo;
    private String nombre;
    private int edad;
    private List<Diagnostico> diagnosticos;

    public Animal(String tipo, String nombre, int edad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnosticos = new ArrayList<>();
    }

    /*public void agregarDiag(Diagnostico diagnostico){
        diagnostico.add(diagnostico);
    }*/

    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    @Override
    public String toString() {
        String s = "Animal" + "\n"
                +"Tipo: "+tipo + "\t"
                +"Nombre:" + nombre +"\t"
                +"Edad: "+edad + "\t"
                +"Diagnosticos: " +diagnosticos;
        return s;
    }
}
