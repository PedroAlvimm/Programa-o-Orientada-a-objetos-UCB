import java.util.ArrayList;

public class TimeDeFutebol {
    String nome;
    ArrayList<Jogador> jogadores = new ArrayList<>();
    ArrayList<Premiacao> titulos = new ArrayList<>();

    public TimeDeFutebol(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }

    public void adicionarTitulo(Premiacao p) {
        titulos.add(p);
    }

    public void listarJogadores() {
        System.out.println("\n=== Jogadores ===");
        for (Jogador j : jogadores) {
            j.exibir();
        }
    }

    public void listarTitulos() {
        System.out.println("\n=== Titulos do Clube (geração atual) ===");
        for (Premiacao p : titulos) {
            p.exibir();
        }
    }
}
// aqui foi onde levei a maior parte do meu tempo, tentava fazer o codigo e sempre dava erro.
// tive que recorrer a metodos improprpios nesses ArrayList <>(); e no geral de Array.
// me serviu como um puxao de orelha para estudar e treinar o uso de Arrays.
