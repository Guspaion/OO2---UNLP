public abstract class TipoAtaque {    
    public int calcularDaño(int daño) {
        return daño;
    }
    
    public void imprimirInfo(Personaje p) {
        System.out.println(p.getNombre() + " tiene como daño " + p.getDaño());
    }
}