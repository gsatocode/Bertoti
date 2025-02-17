package strategy.pattern;

public class Animal {
    private Movimento movimento;

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

    void realizarMovimento() { 
        if (movimento != null) {
            this.movimento.mover();
        } else {
            System.out.println("Nenhum movimento definido.");
        }
    }
}
