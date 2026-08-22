import java.util.*;
public class Wrong_Subraction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=sc.nextInt();
        while(count>0){
            int q=n%10;
            if(q!=0){
                n=n-1;
                count--;
            }
            else{
                n=n/10;
                count--;
            }

        }
        System.out.println(n);
    }
}
