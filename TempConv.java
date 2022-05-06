import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        double fahr, cel;
        Scanner in, in_;
        int option;
        
        in_ =new Scanner(System.in);
        System.out.println("The temperature is in Celsius or Fahrenheit?: ");
        System.out.println("Enter <1> for Celsius or <2> for Fahrenheit. ");
        option = in_.nextInt();
        
        if (option == 2) {
            in = new Scanner(System.in);
            System.out.println("Enter the temperature in F: ");
            fahr = in.nextDouble();
            cel = (fahr - 32) * 5.0/9.0;
            System.out.println("The temperature in C is: " + cel);
            
        } else {
            in = new Scanner(System.in);
            System.out.println("Enter the temperature in C: ");
            cel = in.nextDouble();
            fahr = cel * 1.8 + 32;
            System.out.println("The temperature in F is: " + fahr);   
        }    

        
    }

}