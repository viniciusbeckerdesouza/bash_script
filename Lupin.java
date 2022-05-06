public class Lupin {
    public static void main(String args[]) {
        
        String t = "Hello World";
        System.out.println(t);
        for (char c : t.toCharArray()) {
            System.out.println(c);
        }

        int l[] = {1,1,2,3,5,8,13,21};
        System.out.println(l);
        for(int i : l) {
            System.out.println(i);
        }
        
        System.out.println("Range");
        for (int i = 100; i >= 0; i -= 5)
            System.out.println(i);
    }        
}
