import java.util.Arrays;
import java.util.Scanner;


public class AtividadeArray2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria o vetor com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Solicita os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Calcula a soma dos elementos
        int soma = 0;
        for (int elemento : vetor) {
            soma += elemento;
        }

        // Calcula a média
        double media = (double) soma / tamanho;

        // Exibe o vetor e a média
        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("Média: " + media);

        scanner.close();
    }
}
