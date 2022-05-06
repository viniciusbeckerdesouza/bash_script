import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
    
        ArrayList<Integer> lis, lis2;
        
        lis = new ArrayList<Integer>();
        lis2 = new ArrayList<Integer>();
    
        lis.add(2);
        lis.add(12);
        lis.add(20);
        lis.add(22);
        System.out.println(lis);
        System.out.println(lis.get(1));
        lis.add(3);
        lis.set(4,200);
        System.out.println(lis.size());
        
        lis2.add(33);
        lis2.add(3);
        lis2.add(333);
        lis2.add(13);
        
        System.out.println(lis2.contains(33));
    
    }
}