import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question19 {
    public static void main(String[] args){
        List<Integer> ll = Arrays.asList(2,2,2,2,3,4,5,2,5,6);

        Map<Integer, Integer> hm = new HashMap<>();

        for(Integer tt: ll)
        {
            if(hm.containsKey(tt))
            {
                hm.put(tt, hm.get(tt) +1);
            }
            else hm.put(tt, 1);
        }
        int maxi = Integer.MIN_VALUE;
        int frequent = 0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()) {
            if(entry.getValue() > maxi)
            {
                frequent = entry.getKey();
                maxi = entry.getValue();
            }
        }


        int i1=0,i2=0;
        for(int i =0 ;i< ll.size(); i++)
        {
            if(ll.get(i)==frequent)
            {
                i1 = i;
                break;
            }
        }
        for(int i = ll.size() -1; i>0 ;i--)
        {
            if(ll.get(i) == frequent)
            {
                i2 = i;
                break;
            }
        }

        for(int i = i1; i<= i2 ;i++)
        {
            System.out.print(ll.get(i) + "   ");
        }

    }
}
