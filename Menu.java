import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=5) {
            System.out.println("\n==MENU==");
            System.out.println("1. Cadastrar");
            System.out.println("2. Alterar");
            System.out.println("3. Listar");
            System.out.println("4. Remover");
            System.out.println("5. Sair");
            System.out.println("Escolha a opção: ");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("awebfweifbvihlwe");
                    break;
                case 2:
                    System.out.println("vcchvhgbvhfd");
                    break;
                default:
                System.out.println("você digitou a opção errada");
                    break;    
            }
        }
        sc.close();
    }
}
