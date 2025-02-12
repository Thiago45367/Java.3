import java.util.Scanner;

public class AtividadeMenu3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu das mochilas ---");
            System.out.println("1. Mochila Escolar");
            System.out.println("2. Mochila de Viagem:");
            System.out.println("3. Mochila Esportiva");
            System.out.println("0. Sair");
            System.out.print("Escolha uma mochila: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Mochila Escolar: Compacta e ideal para estudantes.");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas.");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva: Leve, resistente e ergonômica.");
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