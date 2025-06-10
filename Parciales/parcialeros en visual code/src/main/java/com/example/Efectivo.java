public class Efectivo extends Pago {
    private static final double DESCUENTO_EFECTIVO = 2000.0;

    public Efectivo() {
        
    }

    public double calcularMontoFinal() {
        double total = super.calcularMontoFinal();
            if(total > 100000) {
                return (total - this.DESCUENTO_EFECTIVO);
            }
        return total;
    }
}