import java.util.Scanner;

class Saudacao {  
   public static void main(String args[]) {  
      
      String greetings, name;
      greetings = "Olá, seja bem-vindo ";
      System.out.println("Digite seu nome:  ");
      Scanner nome = new Scanner(System.in);
      name = nome.nextLine();
      
      
      System.out.println(greetings + name + "!!!");

    }
}