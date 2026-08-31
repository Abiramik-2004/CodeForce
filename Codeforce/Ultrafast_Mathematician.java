import java.util.*;
public class Ultrafast_Mathematician{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int i=s1.length()-1;
        int j=s2.length()-1;
        String s="";
        while(i>=0&& j>=0){
            if(s1.charAt(i)==s2.charAt(j)){
                    s="0"+s;
                }
                else{
                    s="1"+s;
                }
                j--;
            i--;
        }
        System.out.println(s);
        sc.close();
    }
}
