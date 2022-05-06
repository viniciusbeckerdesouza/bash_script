public class StringsTest {
    public static void main(String[] args){
        String x, z;
        String[] y;
        
        java.util.Scanner in;
        
        z = " uni-duni-te ";
        y = z.split("-");
        
        in = new java.util.Scanner(System.in);
        x = in.nextLine();
        
        System.out.println(z);
        System.out.println(x.substring(3,7));
        System.out.println(x.length());
        System.out.println(y[1]);
        System.out.println(z.trim());
 
 
 
    }

}