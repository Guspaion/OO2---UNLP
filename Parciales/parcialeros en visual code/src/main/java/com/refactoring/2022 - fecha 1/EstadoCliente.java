public abstract class EstadoCliente {
    public EstadoCliente() {

    }

    public Compra comprar(Cliente context, List<Producto> productos) {
        double subtotal = context.getSubtotal(productos);
        context.addCompra(new Compra(productos, subtotal, this.getCostoEnvio(subtotal)));
    }

    public abstract double getCostoEnvio(double subtotal);
}