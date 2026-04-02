public abstract class Reptil extends Animal {

    protected String tipoPele;

    public Reptil(String nome, int idade, String tipoPele) {
        super(nome, idade);
        this.tipoPele = tipoPele;
    }
}