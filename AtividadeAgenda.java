import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeAgenda {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- AGENDA TELEFÔNICA ---");
            System.out.println("1 - CADASTRAR CONTATO");
            System.out.println("2 - LISTAR CONTATOS");
            System.out.println("3 - EXCLUIR CONTATO");
            System.out.println("4 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarContato(contatos, scanner);
                    break;
                case 2:
                    listarContatos(contatos);
                    break;
                case 3:
                    excluirContato(contatos, scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void cadastrarContato(ArrayList<Contato> contatos, Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o número de telefone: ");
        String numero = scanner.nextLine();

        Contato contato = new Contato(nome, numero);
        contatos.add(contato);

        System.out.println("Contato cadastrado com sucesso!");
    }

    public static void listarContatos(ArrayList<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados.");
        } else {
            System.out.println("\n--- LISTA DE CONTATOS ---");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println((i + 1) + ". " + contatos.get(i));
            }
        }
    }

    public static void excluirContato(ArrayList<Contato> contatos, Scanner scanner) {
        if (contatos.isEmpty()) {
            System.out.println("Não há contatos cadastrados para excluir.");
        } else {
            System.out.print("Digite o número do contato que deseja excluir: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (numero >= 1 && numero <= contatos.size()) {
                contatos.remove(numero - 1);
                System.out.println("Contato excluído com sucesso!");
            } else {
                System.out.println("Número de contato inválido.");
            }
        }
    }
}

class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + numero;
    }
}