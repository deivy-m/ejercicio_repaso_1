import udla.dmolina.ejercicio1.*;

public class Main {
    public static void main(String[] args) {
        Persona personaFisica = new Pfisica("juan@gmail.com","Quito", "0962670652");
        Persona personajuridicia = new Pjuridica("empresa@gmail.com","Quito", "0328956714");


        Animal animal = new Animal("Perro", "Firulais", 2);
        Diagnostico diagnostico1 = new Diagnostico("1/12/2024", "Infeccion");

        System.out.println(personaFisica);
        System.out.println(personajuridicia);
        System.out.println(diagnostico1);
    }
}
