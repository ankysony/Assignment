public class Question13 {
    public static void main(String[] args){
        int n = 4456669;
        int ans = 0;
        while(n!=0)
        {
            int rem = n % 10;
            ans = ans + rem;

             if(n/10 !=0)
                ans *= 10;
            n = n/10;
        }
        System.out.println(ans);
    }
}
