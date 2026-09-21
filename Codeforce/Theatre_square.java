import java.util.*;
public class Theatre_square{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        long length = (n + a - 1) / a;
        long width = (m + a - 1) / a;
        long answer = length * width;
        System.out.println(answer);
    }
}