package com.prestamismo;

public abstract class Prestamo {
    protected double monto;
    private int cuotas;
    private int cuotasAbonadas;
    private Cliente cliente;
    private EstadoPrestamo estado;

    public Prestamo(double monto, int cuotas, Cliente cliente) {
        this.monto = monto;
        this.cuotas = cuotas;
        this.cuotasAbonadas = 0;
        this.cliente = cliente;
        if(cliente.alcanzaSalario(monto)) {
            this.estado = new PrestamoAceptado();
        } else {
            this.estado = new PrestamoRechazado();
        }
    }

    public int getCuotasAbonadas() {
        return this.cuotasAbonadas;
    }
    
    public void setCuotasAbonadas(int cuotasAbonadas) {
        this.cuotasAbonadas = cuotasAbonadas;
    }

    public int getCuotas() {
        return this.cuotas;
    }

    public void setEstado(EstadoPrestamo nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public double getMonto() {
        return this.monto;
    }

    public double getMontoRestante() {
        return (getValorCuota() * (this.cuotas - this.cuotasAbonadas))
    }

    public double getPagoTotalActual() {
        return getValorCuota() * this.cuotasAbonadas;
    }

    public double getValorCuota() {
        return Math.round((this.monto / this.cuotas));
    }

    public void pagarCuota() {
        this.estado.pagarCuota(this); 
    }

    public double getGastoCancelacion() {
        return this.estado.getGastosCancelacion(this);
    }

    public double calcularGastoCancelacion() {
        return this.getMontoRestante() * 1.10;
    }

    public abstract double calcularMontoTotal();
}