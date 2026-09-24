import java.util.*;
public class Odd_One_Out {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a!=b && b!=c){
                System.out.println(b);
            }
            else if(a!=b && b==c){
                System.out.println(a);
            }
            else if(a==b && b!=c){
                System.out.println(c);
            }

        } 
    }
}
