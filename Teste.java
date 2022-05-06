import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){

        ArrayList<String> coisas;
        
        coisas = new ArrayList<String>();
        
        coisas.add("bolo");
        coisas.add("bola");
        coisas.add("bolacha");
        coisas.add("bala");
        coisas.add("belo");
        
        System.out.println(coisas);
        
        for (String s : coisas) {
            if (s == "bolo"){
            System.out.println(s);
            } else {
                System.out.println("Não é bolo.");
            }
        }
 
    }

}