import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaApp {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        
        System.out.println("Gerenciador de Tarefas");
        
        while (true) {
            System.out.print("Digite a descrição da tarefa (ou 'sair' para finalizar): ");
            String descricao = scanner.nextLine();
            if (descricao.equalsIgnoreCase("sair")) {
                break;
            }
            
            tarefas.add(new Tarefa(descricao));
            System.out.println("Tarefa adicionada com sucesso!\n");
        }
        
        System.out.println("\nLista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, tarefas.get(i));
        }
        
        System.out.println("\nMarcar tarefas como concluídas (digite os números separados por espaço, ou pressione Enter para pular):");
        String[] indices = scanner.nextLine().split(" ");
        for (String indice : indices) {
            try {
                int idx = Integer.parseInt(indice) - 1;
                if (idx >= 0 && idx < tarefas.size()) {
                    tarefas.get(idx).marcarConcluida();
                }
            } catch (NumberFormatException e) {
                // Ignorar entradas inválidas
            }
        }
        
        System.out.println("\nLista de Tarefas Atualizada:");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
        
        scanner.close();
    }
}
