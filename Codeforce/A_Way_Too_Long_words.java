import java.util.*;
public class A_Way_Too_Long_words{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            String word=sc.nextLine();
            int l=word.length();
            if(l>10){
                String s=""+word.charAt(0)+(l-2)+word.charAt(l-1);;
                System.out.println(s);
            }
            else{
                System.out.println(word);
            }
            n--;
        }
        sc.close();
    }
}