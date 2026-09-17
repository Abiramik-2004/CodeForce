import java.util.*;
public class Plus_Minus{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b==c){
                System.out.println("+");
            }
            else if(a-b==c){
                System.out.println("-");
            }
        }
    }
}