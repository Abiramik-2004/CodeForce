import java.util.*;
public class Medium_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<b && b<c){
                System.out.println(b);
            }
            else if(b<a && a<c){
                System.out.println(a);
            }
            else if(b<c && a>c){
                System.out.println(c);
            }
        }
    }
    
}