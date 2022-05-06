import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class HistoMap {

    public static void main(String[] args) {
        Scanner data = null;
        TreeMap<String,Integer> count;
        int idx;
        String word;
        int wordCount;

        try {
                data = new Scanner(new File("alice.txt"));
        }
        catch ( IOException e) {
            System.out.println("Sorry but I was unable to open your data file");
            e.printStackTrace();
            System.exit(0);
        }

        count = new TreeMap<String,Integer>();

        while(data.hasNext()) {
            word = data.next().toLowerCase();
            wordCount = count.get(word);
            if (Integer.toString(wordCount) == null) {
                wordCount = 0;
            }
            count.put(word,++wordCount);
        }

        for(String i : count.keySet()) {
            System.out.format("%-20s occurred %5d times\n", i, count.get(i) );
        }
    }
}