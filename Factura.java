package udla.dmolina.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String reffactura;
    private List<ElementoFactura> elementoFacturas;

    public Factura(String reffactura) {
        this.reffactura = reffactura;
        this.elementoFacturas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "reffactura='" + reffactura + '\'' +
                ", elementoFacturas=" + elementoFacturas +
                '}';
    }
}
