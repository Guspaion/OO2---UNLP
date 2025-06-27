public class Cliente {
    private String nombre;
    private EstadoCliente estado;
    private List<Compra> compras;

    public Cliente(String nombre, EstadoCliente estado) {
        this.nombre = nombre;
        this.estado = estado;
        this.compras = new ArrayList<Compra>();
    }

    public void setEstado(EstadoCliente estado) {
        this.estado = estado;
    }

    public double getSubtotal(List<Producto> productos) {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public Compra comprar(List<Producto> productos) {
        Compra compraActual = new Compra(productos, this.getSubtotal(productos), this.estado.getCostoEnvio(this, this.getSubotal(subtotal)));
        this.compras.add(compraActual);
        this.estado.actualizarEstado(this);
        return compraActual;
    }

    public double montoAcumuladoEnCompras() {...}
}