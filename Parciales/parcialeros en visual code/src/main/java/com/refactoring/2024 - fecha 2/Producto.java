public class Producto {
    private double precio;
    private double IVA;

    public Producto(double precio, double IVA) {
        this.precio = precio;
        this.IVA = IVA;
    }

    public double getPrecio() {
        return this.precio;
    }

    public double getIVA() {
        return this.IVA;
    }

    public double getPrecioConIVA() {
        return this.precio + (this.precio * this.IVA);
    }
}