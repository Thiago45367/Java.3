import java.util.Scanner;

public class AtividadeMenu1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu das caixas ---");
            System.out.println("1. Caixa de papelão");
            System.out.println("2. Sacola plástica:");
            System.out.println("3. Embalagem de vidro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma caixar: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento.");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável.");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável.");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
