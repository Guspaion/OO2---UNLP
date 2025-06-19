public class Cliente {
    private String nombre;
    private List<Compra> compras;
    private EstadoCliente state;

    public Cliente(String nombre, EstadoCliente estadoInicial) {
        this.nombre = nombre;
        this.estadoInicial = estadoInicial;
        this.compras = new ArrayList<Compra>();
    }

    public double getSubtotal(List<Producto> productos) {
        return productos.stream()
                        .mapToDouble(p -> p.getPrecio())
                        .sum();
    }

    public void addCompra(Compra c) {
        this.compras.add(c);
    }

    public Compra comprar(List<Producto> productos) {
        return this.state.comprar(this, productos);
    }

    public double montoAcumuladoEnCompras() {
        return this.compras.stream()
                            .mapToDouble(c -> c.getPrecioTotal())
                            .sum();
    }
}