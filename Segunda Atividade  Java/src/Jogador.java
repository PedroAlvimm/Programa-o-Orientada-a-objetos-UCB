public class Jogador {
    String nome;
    String posicao;
    int numero;

    public Jogador(String nome, String posicao, int numero) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
    }

    public void exibir() {
        System.out.println(numero + " - " + nome + " (" + posicao + ")");
    }
}
// aqui tambem foi tranquilo so tenho que acostumar com o this e com esses " " +, fiquei um tempo pra lembrar.