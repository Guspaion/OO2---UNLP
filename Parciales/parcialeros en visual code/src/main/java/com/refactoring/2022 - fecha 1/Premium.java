public Premium extends EstadoCliente {
    public Premium() {

    }

    @Override
    public double getCostoEnvio(double subtotal) {
        return subtotal * 0.05;
    }

    @Override
    public Compra comprar(Cliente context, List<Producto> productos) {
        Compra nuevaCompra = super.comprar(context, productos);
        if(context.montoAcumuladoEnCompras() > 10000) {
            context.setState(new Advance());
        }
        return nuevaCompra;
    }
}