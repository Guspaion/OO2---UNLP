public class AtaqueHechizo extends TipoAtaque() {
    public AtaqueHechizo() {

    }

    public int calcularDaño(int daño) {
        return (daño * 2);
    }

    public void imprimirInfo(Personaje p) {
        super.imprimirInfo(p);
        System.out.println("Ataque tipo hechizo");
        System.out.println("Este ataque dobla tu fuerza");
    }
}