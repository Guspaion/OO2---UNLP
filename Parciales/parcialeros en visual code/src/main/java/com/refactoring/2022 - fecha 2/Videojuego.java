public class Videojuego {
    private List<Personaje> personajes;

    public Videojuego() {
        this.personajes = new List<Personaje>();
    }

    public Personaje personajeConMasDaño() {
        return this.personajes.stream()
                                .max((p1, p2) -> Integer.compare(
                                    p1.calcularDaño(), p2.calcularDaño()))
                                    .orElse(null);
    }

    public void imprimirInfo(Personaje p) {
        p.imprimirInfo();
    }
}