package com.prestamismo;

public interface EstadoPrestamo {
    public void pagarCuota(Prestamo context);
    public double getGastosCancelacion(Prestamo context);
}