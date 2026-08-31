import java.util.*;
public class Word_Capitalization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a= Character.toUpperCase(s.charAt(0));
        String res=""+a;
        for(int i=1;i<s.length();i++){
            res+=s.charAt(i);
        }
        System.out.println(res);
        sc.close();

    }
}