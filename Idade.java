/** Função que verifica se a pessoa é maior de idade. */

import java.util.Scanner;

class Idade {  
   public static void main(String args[]) {  
      
      String name;
      int age;
      System.out.println("Digite seu nome:  ");
      Scanner nome = new Scanner(System.in);
      name = nome.nextLine();
      System.out.println("Digite sua idade:  ");
      Scanner idade = new Scanner(System.in);
      age = idade.nextInt();
      
      if (age > 0){
          if (age < 18){
              System.out.println("Desculpe, " + name + ". Não é permitida a entrada de menores de 18 anos.");
          } else {
              System.out.println("Seja bem-vindo, " + name + "!");
              }
      } else {
          System.out.println("Idade inválida!");
        }

    }
}