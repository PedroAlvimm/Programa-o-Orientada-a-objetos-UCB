public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 3, "Curto");
        Gato gato = new Gato("Gato", 2, "Longo");

        Tartaruga tartaruga = new Tartaruga("Tartaruga", 10, "Casco duro");
        Iguana iguana = new Iguana("Iguana", 5, "Escamosa");

        Galinha galinha = new Galinha("Galinha", 1, "Branca");
        Calopsita calopsita = new Calopsita("Calopsita", 2, "Amarela");
        Pardal pardal = new Pardal("Pardal", 1, "Marrom");
        Arara arara = new Arara("Arara", 4, "Azul e Amarela");

        cachorro.emitirSom();
        gato.emitirSom();
        tartaruga.emitirSom();
        iguana.emitirSom();
        galinha.emitirSom();
        calopsita.emitirSom();
        pardal.emitirSom();
        arara.emitirSom();
    }
}