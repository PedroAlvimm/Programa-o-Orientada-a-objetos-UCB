public class Galinha extends Ave {

    public Galinha(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Có Có | Cor das Penas: " + corPenas);
    }
}