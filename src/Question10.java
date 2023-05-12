import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> st = new HashSet();

        for(int i = 0 ;i< n;i++)
        {
            int a = sc.nextInt();
            l.add(a);
            st.add(a);
        }
        int sum = sc.nextInt();
        for(int i =0 ;i< n;i++) {
            int check = sum - l.get(i);
            if (st.contains(check))
            {
                System.out.println("( " + l.get(i) + " , "  + check + " ) ");
                st.remove(l.get(i));
            }
        }
        System.out.println("done");
    }
}
