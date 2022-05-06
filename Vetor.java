import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
 
        int[] arr = new int[10];
        boolean[] arrBool = new boolean[5];
        String[] arrStr = new String[8];
        
        for (int x = 0; x < 10; x++) {
            arr[x] = x * 2;
        }
        
        for (int x: arr) {
            System.out.println(x);
        }
        
        for (boolean b: arrBool) {
            System.out.println(b);
        }
        
        for (String c: arrStr) {
            System.out.println(c);
        }
        
        System.out.println(arrStr.length);
        
    }

}