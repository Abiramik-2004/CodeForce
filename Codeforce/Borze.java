import java.util.*;
public class Borze{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=a[i];
            if(c=='.'){
                res+=0;
            }
            else if(c=='-'&&a[i+1]=='.'){
                res+=1;
                i++;
            }
            else if(c=='-'&&a[i+1]=='-'){
                res+=2;
                i++;
            }
        }
        System.out.println(res);
    }
}