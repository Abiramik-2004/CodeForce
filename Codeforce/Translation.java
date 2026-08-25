import java.util.*;
public class Translation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean b=true;
        if(s1.length()==s2.length()){
            int j=s2.length()-1;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(j)){
                    b=false;
                    break;
                }
                j--;
            }
        }
        else{
            b=false;
        }
        if(b==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}