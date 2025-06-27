public class Efectivo extends StratPago {
    private final static double DESCUENTO_EFECTIVO = 2000.0;

    public Efectivo() {

    }

    public double aplicarExtra(double total) {
        if(total > 100000) {
            return this.total - this.DESCUENTO_EFECTIVO;
        }
        return this.total;
    }
}