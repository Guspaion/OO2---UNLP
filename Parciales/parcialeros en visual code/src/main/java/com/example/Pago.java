public class Pago {
    private List<Producto> productos;

    public Pago(List<Producto> productos) {
        this.productos = productos;
    }

    public double calcularMontoFinal() {
        return (this.productos.stream()
                .mapToDouble(p -> p.getPrecioBase())
                .sum());  
    }
}