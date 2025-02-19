import java.util.Scanner;

public class AtividadeArray3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do array com 10 posições
        int[] numeros = new int[10];

        // Leitura dos 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Encontrar o menor e o maior valor
        int menor = numeros[0]; // Assume que o primeiro elemento é o menor
        int maior = numeros[0]; // Assume que o primeiro elemento é o maior

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // Exibir os resultados
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);

        scanner.close();
}

}