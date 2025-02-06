import java.util.Scanner;

public class Atividade4 {
    
  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite uma senha");
     String senha=sc.next();

     if(senha.equals(senha)){
      System.out.println("porta aberta");
     }else{
      System.out.println("porta fechada");
     }
     sc.close();
}

}