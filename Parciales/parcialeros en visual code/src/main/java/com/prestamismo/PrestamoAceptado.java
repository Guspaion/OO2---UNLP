package com.prestamismo;

public class PrestamoAceptado implements EstadoPrestamo {
    public PrestamoAceptado() {
        // Constructor vacío
    }

    @Override
    public void pagarCuota(Prestamo context){
        context.setCuotasAbonadas(context.getPagos() + 1);
        if(context.getCuotasAbonadas() == context.getCuotas()) {
            context.setEstado(new PrestamoFinalizado());
        }
    }

    @Override
    public double getGastosCancelacion(Prestamo context) {
        return context.calcularGastoCancelacion();
    }
}