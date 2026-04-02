public class Tartaruga extends Reptil {

    public Tartaruga(String nome, int idade, String tipoPele) {
        super(nome, idade, tipoPele);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Tartaruga) | Pele: " + tipoPele);
    }
}