import java.util.Scanner;

public class AlunoApp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando dados do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Criando o aluno
        Aluno aluno = new Aluno(nomeAluno);

        // Solicitando as notas
        System.out.println("Digite as notas do aluno (digite um valor negativo para finalizar): ");
        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break; // Finaliza a entrada de notas quando o usuário digitar um valor negativo
            }

            aluno.adicionarNota(nota); // Adiciona a nota ao aluno
        }

        // Exibindo as informações do aluno
        aluno.exibirInformacoes();

        scanner.close();
    }
}
