import java.util.Scanner;

public class CamisaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camisa camisa = null;
        
        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Criar Camisa");
            System.out.println("2. Exibir Camisa");
            System.out.println("3. Modificar Camisa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            
            switch (opcao) {
                case 1: // Criar Camisa
                    System.out.print("Digite a cor da camisa: ");
                    String cor = scanner.nextLine();
                    System.out.print("Digite o tamanho da camisa: ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Digite o tipo da camisa (Ex: Polo, Camisa Social, etc.): ");
                    String tipo = scanner.nextLine();
                    
                    camisa = new Camisa(cor, tamanho, tipo);
                    System.out.println("Camisa criada com sucesso!");
                    break;
                
                case 2: // Exibir Camisa
                    if (camisa != null) {
                        System.out.println("\nInformações da Camisa:");
                        camisa.exibirInformacoes();
                    } else {
                        System.out.println("Nenhuma camisa foi criada ainda.");
                    }
                    break;
                
                case 3: // Modificar Camisa
                    if (camisa != null) {
                        System.out.println("\nO que você gostaria de modificar?");
                        System.out.println("1. Cor");
                        System.out.println("2. Tamanho");
                        System.out.println("3. Tipo");
                        System.out.print("Escolha uma opção: ");
                        int opcaoModificar = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner
                        
                        switch (opcaoModificar) {
                            case 1:
                                System.out.print("Digite a nova cor: ");
                                camisa.setCor(scanner.nextLine());
                                System.out.println("Cor modificada com sucesso!");
                                break;
                            case 2:
                                System.out.print("Digite o novo tamanho: ");
                                camisa.setTamanho(scanner.nextLine());
                                System.out.println("Tamanho modificado com sucesso!");
                                break;
                            case 3:
                                System.out.print("Digite o novo tipo: ");
                                camisa.setTipo(scanner.nextLine());
                                System.out.println("Tipo modificado com sucesso!");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Nenhuma camisa foi criada ainda.");
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

