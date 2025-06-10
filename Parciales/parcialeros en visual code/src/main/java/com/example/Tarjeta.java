public class Tarjeta extends Pago {
    private static final double ADICIONAL_TARJETA = 1000.0;

    public Tarjeta(double adicional) {
        this.adicional = adicional;
    }

    public double calcularMontoFinal() {
        double total = super.calcularMontoFinal();
        return(total + this.ADICIONAL_TARJETA);
    }
}