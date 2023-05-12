import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Question17 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,5,6,7,8,9);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0 ;i<l.size(); i++)
        {
            pq.add(l.get(i));
        }
        pq.poll();
        System.out.println("the second largest element is " + pq.peek());
    }
}
