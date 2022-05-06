import java.util.Scanner;

class Entrada {  
   public static void main(String args[]) {  
      System.out.println("Digite uma string:  ");
      Scanner nome = new Scanner(System.in);
      System.out.println(nome.nextLine());
      
      System.out.println("Digite um byte:  ");
      Scanner digito = new Scanner(System.in);
      System.out.println(digito.nextByte());
       
      System.out.println("Digite um float:  ");
      Scanner decimal = new Scanner(System.in);
      System.out.println(decimal.nextFloat());
    }
}