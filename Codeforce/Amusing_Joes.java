import java.util.*;
public class Amusing_Joes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.nextLine();
        String suf=sc.nextLine();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<suf.length();i++){
            char ch=suf.charAt(i);
            l.add(ch);
        }
        int count=s.length()+c.length();
        if(count!=suf.length()){
            System.out.println("NO");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(l.contains(ch)){
                l.remove(Character.valueOf(ch));

            }
            else{
                System.out.println("NO");
                return;
            }
        }
        for(int i=0;i<c.length();i++){
            char ch=c.charAt(i);
            if(l.contains(ch)){
                l.remove(Character.valueOf(ch));

            }
            else{
                System.out.println("NO");
                return;
            }
        }
        if(l.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}