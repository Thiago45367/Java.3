import java.util.Scanner;

public class AtividadeMenu {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=4) {
            System.out.println("\n==MENU==");
            System.out.println("1. Caixa de papelão");
            System.out.println("2. Sacola plástica");
            System.out.println("3. Embalagem de vidro");
            System.out.println("4. Finalizar a Seleção");
            System.out.println("Escolha sua Caixa: ");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Seleção concluida");
                    break;
                case 2:
                    System.out.println("Seleção não concluida");
                    break;
                default:
                System.out.println("Tenha um bom dia");
                    break;        
            }
        }
        sc.close();
    }
}
