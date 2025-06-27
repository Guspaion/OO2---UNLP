public class Pago {
    private List<Producto> productos;
    private StratPago estrategiaPago;

    public Pago(List<Producto> productos, StratPago estrategiaPago) {
        this.productos = productos;
        this.estrategiaPago = estrategiaPago;
    }

    public double calcularMontoFinal() {
        return estrategiaPago.calcularMontoFinal(productos);
    }
}