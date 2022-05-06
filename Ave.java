/** Retorna se é uma ave */

import java.util.Scanner;

class Ave {  
   public static void main(String args[]) {  
      
      int option;
      
      System.out.println("Bota ovo?  ");
      System.out.println("1: Sim, 2: Não");
      Scanner entry = new Scanner(System.in);
      option = entry.nextInt();
      
      if (!(option <= 2)) {
          System.out.println("Opção inválida.");
      } else {
          System.out.println("Pode ser uma ave.");
      }

    }
}