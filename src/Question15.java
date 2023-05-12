import java.util.Scanner;

public class Question15 {

    public static Boolean isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u')
            return Boolean.TRUE;
        else return Boolean.FALSE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str ="";
        for(int i=0;i<s.length(); i++)
        {
            if(!isVowel(s.charAt(i))){
                str = str + s.charAt(i);
            }
        }
        System.out.println(str);

    }
}
