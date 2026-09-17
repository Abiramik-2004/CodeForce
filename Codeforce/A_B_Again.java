import java.util.*;
public class A_B_Again{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            String s=""+a;
            if(a>=10 &&a<=99){
                char[] c=s.toCharArray();
                System.out.println(Integer.parseInt(c[0]+"")+Integer.parseInt(c[1]+""));
            }
        }
    }
}