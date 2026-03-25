import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TimeDeFutebol flamengo = new TimeDeFutebol("Flamengo");// até aqui ok

        // Jogadores atuais (base) ,tive que pesquisar por fora.
        flamengo.adicionarJogador(new Jogador("Rossi", "Goleiro", 1));
        flamengo.adicionarJogador(new Jogador("Varela", "Lateral Direito", 2));
        flamengo.adicionarJogador(new Jogador("Fabricio Bruno", "Zagueiro", 15));
        flamengo.adicionarJogador(new Jogador("Leo Pereira", "Zagueiro", 4));
        flamengo.adicionarJogador(new Jogador("Ayrton Lucas", "Lateral Esquerdo", 6));
        flamengo.adicionarJogador(new Jogador("Pulgar", "Volante", 5));
        flamengo.adicionarJogador(new Jogador("Gerson", "Meio Campo", 8));
        flamengo.adicionarJogador(new Jogador("Arrascaeta", "Meia", 14));
        flamengo.adicionarJogador(new Jogador("Luiz Araujo", "Ponta", 7));
        flamengo.adicionarJogador(new Jogador("Cebolinha", "Ponta", 11));
        flamengo.adicionarJogador(new Jogador("Pedro", "Atacante", 9));

        // Títulos conquistados por essa geração (aproximado)
        // aqui tambem fui atrás apenas das premiações que os jogadores atuais no clube tem.
        flamengo.adicionarTitulo(new Premiacao("Libertadores", 2019));
        flamengo.adicionarTitulo(new Premiacao("Libertadores", 2022));
        flamengo.adicionarTitulo(new Premiacao("Brasileirão", 2019));
        flamengo.adicionarTitulo(new Premiacao("Brasileirão", 2020));
        flamengo.adicionarTitulo(new Premiacao("Copa do Brasil", 2022));
        flamengo.adicionarTitulo(new Premiacao("Copa do Brasil", 2024));

        int opcao;

        do {
            System.out.println("\n==== MENU FLAMENGO ====");
            System.out.println("1 - Ver jogadores");
            System.out.println("2 - Ver titulos");
            System.out.println("3 - Ver tudo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            // muito legal fazer esse meno interativo so apanhei um pouco pois nao lembrava do default.
            switch (opcao) {
                case 1:
                    flamengo.listarJogadores();
                    break;

                case 2:
                    flamengo.listarTitulos();
                    break;

                case 3:
                    flamengo.listarJogadores();
                    flamengo.listarTitulos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}