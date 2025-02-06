
import java.util.Scanner;

public class Atividade3 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double num1 = sc.nextDouble();
        System.out.println("Digite um número");
        double num2 = sc.nextDouble();
        double media =(num1 + num2) / 2;
        System.out.println(media);
    }
}
