public class AtaqueBasico extends TipoAtaque {
    public AtaqueBasico() {

    }

    public void imprimirInfo(Personaje p) {
        super.imprimirInfo(p);
        System.out.println("Ataque tipo básico");
        System.out.println("Este ataque mantiene tu fuerza");
    }
}