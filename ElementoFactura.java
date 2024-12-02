package udla.dmolina.ejercicio1;

public class ElementoFactura {
    private String elemento;
    private double precio;
    private int cantidad;

    public ElementoFactura(String elemento, double precio, int cantidad) {
        this.elemento = elemento;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getElemento() {
        return elemento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        String s = "Elemento factura" + "\n"
                +"Elemnto: " + elemento + "\t"
                +"Precio: "+precio +"$" + "\t"
                +"Cantidad: "+cantidad;
        return s;
    }

    public double calcularSubtotal(){
        return precio * cantidad;
    }
}
