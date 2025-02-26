public class CamisaApp {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("Azul", "M", "Polo");
        camisa1.exibirInformacoes();

        Camisa camisa2 = new Camisa("Vermelha", "G", "Esportiva");
        camisa2.setCor("Verde"); // Modificando a cor
        camisa2.exibirInformacoes();
    }
}
