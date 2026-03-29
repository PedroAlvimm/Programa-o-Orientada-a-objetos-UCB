import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contato[] contatos = new Contato[3]; // cria um vetor (array) com 3 posicoes.
                                             // cada posicao pode guardar um objeto CONTATO.

        int opcao;

        do {      // COMECA O LOOP DO MENU.
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar contatos");
            System.out.println("2 - Alterar contatos");
            System.out.println("3 - Exibir contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt(); // LER A OPCAO.
            sc.nextLine(); // limpar buffer.

            switch (opcao) {  // DECIDE COM BASE NO NUMERO DIGITADO.

                case 1:
                    for (int i = 0; i < contatos.length; i++) { // LOOP DE 0 ATE 2 (3 CONTATOS)
                        System.out.println("\nContato " + (i + 1));

                        System.out.print("Nome: ");
                        String nome = sc.nextLine(); // LER OS DADOS DIGITADOS.

                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();

                        contatos[i] = new Contato(nome, telefone); // CRIA O OBJETO E GUARDA NO VETOR.
                    }
                    break;

                case 2: // PONTO DE MAIOR DIFICULDADE NAO CONSEGUI FAZER SOZINHO VOU TER QUE REVER MAIS.
                    for (int i = 0; i < contatos.length; i++) {

                        if (contatos[i] != null) {
                            System.out.println("\nDeseja alterar o contato " + (i + 1) + "? (s/n)");
                            String resp = sc.nextLine();

                            if (resp.equalsIgnoreCase("s")) {
                                System.out.print("Novo nome: ");
                                contatos[i].setNome(sc.nextLine());

                                System.out.print("Novo telefone: ");
                                contatos[i].setTelefone(sc.nextLine());
                            }
                        } else {
                            System.out.println("Contato " + (i + 1) + " ainda não foi cadastrado.");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < contatos.length; i++) {

                        System.out.println("\nContato " + (i + 1));

                        if (contatos[i] != null) { // VERIFICAR SE EXISTE CONTATOS
                            System.out.println("Nome: " + contatos[i].getNome()); // GETTER PARA ACESSAR O VALOR ANTES GUARDADO.
                            System.out.println("Telefone: " + contatos[i].getTelefone());
                        } else {
                            System.out.println("Contato não cadastrado."); //Caso esteja vazio
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa..."); // Mensagem de saída
                    break;

                default:
                    System.out.println("Opção inválida!"); // SE FOR ALGO DIFERENTE DE TUDO ISSO
            }

        } while (opcao != 0); // SO PARA QUANDO O USUARIO DIGITA 0

        sc.close(); // FECHAR O SCANNER.
    }
}