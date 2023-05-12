import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();

        int cur =1;
        int flag =0;
        for(int i=0 ;i< s.length() -2 ;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                cur ++;
            }
            else
            {
                if(cur>1)
                {
                    System.out.println(s.charAt(i));
                    flag=1;
                }
                cur =1;
            }
        }
        if(flag ==0)
        System.out.println("no repeating character");
    }
}
