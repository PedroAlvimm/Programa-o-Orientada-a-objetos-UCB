public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade, String tipoPelo) {
        super(nome, idade, tipoPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au Au | Pelo: " + tipoPelo);
    }
}