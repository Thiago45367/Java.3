import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoApp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade do produto: ");
            int quantidade = scanner.nextInt();

            scanner.nextLine(); // Consumir a nova linha

            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);
        }

        System.out.println("\nLista de produtos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
