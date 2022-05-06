import java.util.Arrays;

public class noNeg {
    public static void main(String[] args){
    
    int[] numArr = {1,-3,5,7,-9};
    
    for (int x : numArr) {
        if (x < 0) {
            int i = Arrays.asList(numArr).indexOf(x);
            numArr[i] = 0;
        }
    }
    
    
    System.out.println(Arrays.toString(numArr));
    
    
    }
}