import java.util.Scanner;

public class CarroApp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = null;

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Criar Carro");
            System.out.println("2. Exibir Carro");
            System.out.println("3. Modificar Carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1: // Criar Carro
                    System.out.print("Digite a marca do carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano de fabricação do carro: ");
                    int anoFabricacao = scanner.nextInt();
                    
                    carro = new Carro(marca, modelo, anoFabricacao);
                    System.out.println("Carro criado com sucesso!");
                    break;

                case 2: // Exibir Carro
                    if (carro != null) {
                        System.out.println("\nInformações do Carro:");
                        carro.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum carro foi criado ainda.");
                    }
                    break;

                case 3: // Modificar Carro
                    if (carro != null) {
                        System.out.println("\nO que você gostaria de modificar?");
                        System.out.println("1. Marca");
                        System.out.println("2. Modelo");
                        System.out.println("3. Ano de Fabricação");
                        System.out.print("Escolha uma opção: ");
                        int opcaoModificar = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner
                        
                        switch (opcaoModificar) {
                            case 1:
                                System.out.print("Digite a nova marca: ");
                                carro.setMarca(scanner.nextLine());
                                System.out.println("Marca modificada com sucesso!");
                                break;
                            case 2:
                                System.out.print("Digite o novo modelo: ");
                                carro.setModelo(scanner.nextLine());
                                System.out.println("Modelo modificado com sucesso!");
                                break;
                            case 3:
                                System.out.print("Digite o novo ano de fabricação: ");
                                carro.setAnoFabricacao(scanner.nextInt());
                                System.out.println("Ano de fabricação modificado com sucesso!");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Nenhum carro foi criado ainda.");
                    }
                    break;

                case 4: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
