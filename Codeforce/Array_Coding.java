import java.util.*;
public class Array_Coding{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            int[] a=new int[k];
            int sum=0;
            for(int j=0;j<k;j++){
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            if(sum%2==0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}