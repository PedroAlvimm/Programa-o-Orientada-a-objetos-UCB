public abstract class Mamifero extends Animal {

    protected String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }
}