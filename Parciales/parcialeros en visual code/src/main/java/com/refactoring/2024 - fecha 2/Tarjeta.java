public class Tarjeta extends StratPago {
    private final static double ADICIONAL_TARJETA = 1000.0;

    public Tarjeta() {

    }

    public double aplicarExtra(double total) {
        return total + this.ADICIONAL_TARJETA;
    }
}