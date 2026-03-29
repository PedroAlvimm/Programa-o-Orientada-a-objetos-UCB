public class Contato {

    private String nome; // so pode ser acessado dentro da classe ( encapsulamento ).
    private String telefone;

    // Construtor da classe Contato.
    // e chamado com o new na classe Main, o new cria um objeto na memoria e o contato chama o construct.

    public Contato(String nome, String telefone) {
        this.nome = nome; // this.nome = atributo da classe e nome = parametro do contrutor.
        this.telefone = telefone; //atributo telefone recebe o valor do parâmetro telefone.
    }

    // Getter nome ( pega o valor e retorna algo.
    public String getNome() {
        return nome;
    }

    // Setter nome ( altera o valor mas nao retorna nada).
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
