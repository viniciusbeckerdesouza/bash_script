/** Retorna se a pessoa é do Sul */

import java.util.Scanner;

class Sul {  
   public static void main(String args[]) {  
      
      int uf;
      
      System.out.println("Digite seu Estado:  ");
      System.out.println("1: RS, 2: SC, 3: BA, 4: GO, 5: PR");
      Scanner estado = new Scanner(System.in);
      uf = estado.nextInt();
      
      if (uf == 1 || uf == 2 || uf == 5) {
          System.out.println("É do Sul.");
      } else {
          System.out.println("Não é do Sul");
      }

    }
}