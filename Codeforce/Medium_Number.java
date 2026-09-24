import java.util.*;
public class Medium_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int res=(a>b)?((a>c)?a:c):(b>c)?b:c;
            System.out.println(res);
        }
    }
    
}