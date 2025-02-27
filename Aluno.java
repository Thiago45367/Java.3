import java.util.ArrayList;

public class Aluno {
      // Atributos privados
    private String nome;
    private ArrayList<Double> notas;

    // Construtor para inicializar o nome e a lista de notas
    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    // Método para adicionar notas à lista
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return notas.size() > 0 ? soma / notas.size() : 0;
    }

    // Método para exibir as informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média final: " + calcularMedia());
    } 
}
