public class Teste {
    public static void main(String[] args) {
        Animal ave = new Animal(new MovimentoVoo()) {
            @Override
            public void exibir() {
                System.out.println("Sou uma ave.");
            }
        };

        Animal aviao = new Animal(new MovimentoVoo()) {
            @Override
            public void exibir() {
                System.out.println("Sou um avião.");
            }
        };

        ave.exibir();
        ave.mover();

        System.out.println();

        aviao.exibir();
        aviao.mover();
    }
}
