public class Premium extends EstadoCliente {
    public Premium() {

    }

    protected double getCostoEnvio(double subtotal) {
        return subtotal * 0.05;
    }

    protected void actualizarEstado(Cliente context) {
        if(context.montoAcumuladoEnCompras() > 10000) {
            context.setEstado(new Advance());
        }
    }
}