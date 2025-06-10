package com.prestamismo;

public class PrestamoRechazado implements EstadoPrestamo {
    public PrestamoRechazado() {
        // Constructor vacío
    }

    @Override
    public void pagarCuota(Prestamo context) {
        throw new Error("error");
    }

    @Override
    public double getGastosCancelacion(Prestamo context) {
        throw new Error("Error");
    }
}