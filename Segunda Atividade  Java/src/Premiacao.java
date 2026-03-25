public class Premiacao {
    String titulo;
    int ano;

    public Premiacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println(titulo + " (" + ano + ")");
    }
}
// essa classe foi mais tranquila até pelo tamanho dela.