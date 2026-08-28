import java.util.*;
public class A_Required_Reminder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t!=0) {
            long x=sc.nextLong();
            long y=sc.nextLong();
            long n=sc.nextLong();
            long k = x * ((n - y) / x) + y;
            System.out.println(k);
            t--;
            
        }
        sc.close();
    }
}