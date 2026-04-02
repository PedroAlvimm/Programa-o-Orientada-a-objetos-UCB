public class Pardal extends Ave {

    public Pardal(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Piu Piu | Cor das Penas: " + corPenas);
    }
}