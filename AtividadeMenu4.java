import java.util.Scanner;

public class AtividadeMenu4 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Digite a opção: ");
            
            // Lê a opção do usuário
            opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo do programa...");
                break; // Encerra o loop
            }

            // Solicita os dois números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Executa a operação com base na escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5); // O programa continua até o usuário escolher sair

        scanner.close();
    }
}
