
import java.util.Scanner;


public class AtividadeArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de nomes a serem inseridos
        System.out.println("Digite a quantidade de nomes que deseja cadastrar: ");
        int quantidadeNomes = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do teclado

        // Cria o array de strings para armazenar os nomes
        String[] nomes = new String[quantidadeNomes];

        // Solicita os nomes um por um
        System.out.println("Digite os nomes:");
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println("Nome "+ (i +1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        // Exibe os nomes cadastrados e suas posições no array
        System.out.println("\nNomes cadastrados: ");
        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println("Posição "+ i + ": "+ nomes[i]);
        }
        scanner.close();
    }
}
