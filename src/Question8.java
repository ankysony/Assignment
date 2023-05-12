import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write the occurence of all the words in a sentence using collections framework

 */
public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String input = scanner.next();
        System.out.println(input);
        scanner.close();
        String word = "";
        Map<String, Integer> mp = new HashMap<>();

        for(int i=0 ; i< input.length() ; i++)
        {
            if(input.charAt(i)!= ' ')
            {
                word += input.charAt(i);
            }
            else
            {
                if(mp.containsKey(word))
                {
                    mp.put(word, mp.get(word) +1);
                }
                else
                {
                    mp.put(word, 1);
                }
                word = "";
            }
        }

        for(Map.Entry<String,Integer> entry: mp.entrySet()) {
            System.out.println("[ "+ entry.getKey() + "-----> " + entry.getValue()+ " ]");
        }
    }
}
