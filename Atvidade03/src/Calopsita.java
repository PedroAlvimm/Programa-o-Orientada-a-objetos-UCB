public class Calopsita extends Ave {

    public Calopsita(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Fiu Fiu | Cor das Penas: " + corPenas);
    }
}