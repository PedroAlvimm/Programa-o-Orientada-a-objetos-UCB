public class Gato extends Mamifero {

    public Gato(String nome, int idade, String tipoPelo) {
        super(nome, idade, tipoPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau | Pelo: " + tipoPelo);
    }
}