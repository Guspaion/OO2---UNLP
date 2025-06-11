public Basico extends EstadoCliente {
    public Basico() {

    }

    @Override
    public double getCostoEnvio(double subtotal) {
        return context.getSubtotal(productos) * 0.1;
    }

    @Override
    public Compra comprar(Cliente context, List<Producto> productos) {
        Compra nuevaCompra = super.comprar(context, productos);
        if(context.montoAcumuladoEnCompras() > 5000) {
            context.setState(new Premium());
        }
        return nuevaCompra;
    }
}