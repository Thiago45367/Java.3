import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioApp {
    public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        
        System.out.println("Cadastro de Funcionários");
        
        while (true) {
            System.out.print("Digite o nome do funcionário (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            
            System.out.print("Digite o cargo: ");
            String cargo = scanner.nextLine();
            
            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha
            
            funcionarios.add(new Funcionario(nome, cargo, salario));
            System.out.println("Funcionário cadastrado com sucesso!\n");
        }
        
        System.out.println("\nLista de Funcionários Cadastrados:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        
        scanner.close();
    }
}

}