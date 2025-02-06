
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Exercio 1: operacao basicas
        System.out.println("\nExercicio 1:");
        System.out.println("Digite primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("soma:" + (num1 + num2));
        System.out.println("subtração:" + (num1 - num2));
        System.out.println("divisão:" + (num1 / num2));
        System.out.println("multiplicação:" + (num1 * num2));

        // Exercicio 2: media aritmetica de dois numeros
        System.out.println("\nExercicio 2: ");
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        double media2 =(num1 + num2) / 2;
        System.out.println("Média aritmetica: " + media2);

        // Exercicio 3: media aritmetica de tres numeros
        System.out.println("\nExercicio 3: ");
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double media3 = (num1 + num2 + num3) / 3;
        System.out.println("Média aritmética: " + media3);

        // Exercicio 4: concatenacao de palavras
        System.out.println("\nExercicio 4: ");
        System.out.println("Digite o primeiro palavra: ");
        String palavra1 = scanner.next();
        System.out.println("Digite o segunda palavra: ");
        String palavra2 = scanner.next();

        String palavraResultante = palavra1 + palavra2;
        System.out.println("palavra resultante: " + palavraResultante);

        scanner.close();
    }    
}