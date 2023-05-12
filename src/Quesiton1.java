import java.util.*;
// Write a program to find a number which is occuring odd number of times in an array ?
public class Quesiton1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array");
        n = sc.nextInt();
        System.out.println("Give the numbers of array");
        for(int i =0 ;i< n;i++)
        {
            int a = sc.nextInt();
            list.add(a);
        }
        Map<Integer,Integer> mp = new TreeMap();

        for(int i = 0 ;i<n; i++)
        {
            if(mp.containsKey(list.get(i)))
            {
                mp.put(list.get(i), mp.get(list.get(i))+1 );
            }
            else
                mp.put(list.get(i), 1);

        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
            if(entry.getValue() % 2 == 1)
                System.out.println(entry.getKey() + " is present odd number of times");

    }
}
