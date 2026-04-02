public class Arara extends Ave {

    public Arara(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Aaaaah! | Cor das Penas: " + corPenas);
    }
}