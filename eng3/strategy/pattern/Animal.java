public abstract class Animal {
    protected Movimento movimento;

    public Animal(Movimento movimento) {
        this.movimento = movimento;
    }

    public void mover() {
        movimento.mover();
    }

    public abstract void exibir();
}
