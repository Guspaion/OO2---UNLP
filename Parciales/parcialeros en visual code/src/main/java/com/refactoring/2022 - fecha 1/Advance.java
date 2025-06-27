public class Advance extends EstadoCliente {
    public Advance() {
        
    }

    public double getCostoEnvio(double subtotal) {
        return 0;
    }

    public void actualizarEstado(Cliente context) {
        //No cambia el estado dado que es el estado final
    }
}