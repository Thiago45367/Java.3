public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;

    // Construtor
    public Camisa(String cor, String tamanho, String tipo) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    // Métodos Getters e Setters para encapsulamento
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para exibir informações da camisa
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo: " + tipo);
    }
}
