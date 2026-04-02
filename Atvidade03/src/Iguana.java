public class Iguana extends Reptil {

    public Iguana(String nome, int idade, String tipoPele) {
        super(nome, idade, tipoPele);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Iguana) | Pele: " + tipoPele);
    }
}