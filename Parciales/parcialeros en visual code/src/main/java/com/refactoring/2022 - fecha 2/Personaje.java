public class Personaje {
    private String nombre;
    private int daño;
    private TipoAtaque tipoAt;

    public Personaje(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public int calcularDaño() {
        return tipoAt.calcularDaño(this.daño);
    }

    public void imprimirInfo() {
        this.tipoAt.imprimirInfo(this);
    }
}