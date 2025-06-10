package com.prestamismo;

public class UVA extends Prestamo {
    public UVA(double monto, int cuotas, Cliente cliente) {
        super(monto, cuotas, cliente);
    }

    @Override
    public double getValorCuota() {
        double interesActual = INDEC.getIndiceUVA();
        return Math.round((super.getValorCuota() * (1 + interesActual)))
    }

    @Override
    public double calcularMontoTotal() {
        double interesActual = INDEC.getIndiceUVA();
        return Math.round((this.getValorCuota() * super.getCuotas()) * (1 + interesActual))
    }
}