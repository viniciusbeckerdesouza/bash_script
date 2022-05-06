import java.util.Scanner;


public class TestCondition {
    public static void main(String args[]) {
        
        int a, x;
        Scanner in;
        
        in = new Scanner(System.in);
        a = in.nextInt();
        x = a + 1;
        
        a = a % 2 == 0 ? a*a : 3*x -1;
        
        System.out.println(a);
        

    }
}