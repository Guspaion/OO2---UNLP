public class Basico extends EstadoCliente {
    public Basico() {
        
    }

    protected double getCostoEnvio(double subtotal) {
        return subtotal * 0.1;
    }

    protected void actualizarEstado(Cliente context) {
        if(context.montoAcumuladoEnCompras() > 5000) {
            context.setEstado(new Premium());
        }
    }
}