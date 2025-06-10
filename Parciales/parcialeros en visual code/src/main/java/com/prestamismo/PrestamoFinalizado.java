package com.prestamismo;

public class PrestamoFinalizado implements EstadoPrestamo {
    public PrestamoFinalizado() {
        // Constructor vacío
    }

    @Override
    public void pagarCuota(Prestamo context) {
        throw new Error("Error");
    }

    @Override
    public double getGastosCancelacion(Prestamo context) {
        return 0;
    }
}