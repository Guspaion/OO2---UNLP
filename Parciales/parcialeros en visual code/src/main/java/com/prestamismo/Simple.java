pacakage com.prestamismo;

public class Simple extends Prestamo {
    private double tasaInteres;

    public Simple(double monto, int cuotas, Cliente cliente, double tasaInteres) {
        super(monto, cuotas, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double getValorCuota() {
        return Math.round((super.getValorCuota() * (1 + this.tasaInteres)));
    }

    @Override
    public double calcularMontoTotal() {
        return Math.round((this.getValorCuota() * this,getCuotas()));
    }

    @Override
    public double calcularGastoCancelacion() {
        return super.calcularGastoCancelacion() + 5000;
    }
}