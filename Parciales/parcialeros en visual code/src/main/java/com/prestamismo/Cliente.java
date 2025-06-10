package com.prestamismo;

public class Cliente {
    private String nombre;
    private double salarioMensual;

    public Cliente(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public boolean alcanzaSalario(double monto){
        return (monto <= salarioMensual * 0.3);
    }
}