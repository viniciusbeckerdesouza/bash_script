import java.util.Scanner;

class Quadrado {  
   public static void main(String args[]) {  
      
      System.out.println("Digite um número:  ");
      Scanner num1 = new Scanner(System.in);
      int x = num1.nextInt();
      
      int result = x * x;
      
      System.out.println(result);

    }
}