package strategy.pattern;

public class Teste {
    public static void main(String[] args) {
        Animal pagaio = new Animal();
        pagaio.setMovimento(new MovimentoVoo());
        pagaio.realizarMovimento();

        Animal cao = new Animal();
        cao.setMovimento(new MovimentoCorrida());
        cao.realizarMovimento();

        Animal baleia = new Animal();
        baleia.setMovimento(new MovimentoNado());
        baleia.realizarMovimento();
    }
}