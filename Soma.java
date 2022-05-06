import java.util.Scanner;

class Soma {  
   public static void main(String args[]) {  
      
      System.out.println("Digite um número:  ");
      Scanner num1 = new Scanner(System.in);
      int x = num1.nextInt();
      
      System.out.println("Digite outro número:  ");
      Scanner num2 = new Scanner(System.in);
      int y = num2.nextInt();
      
      int result = x + y;
      
      System.out.println(result);

    }
}