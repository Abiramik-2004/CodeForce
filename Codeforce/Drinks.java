import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        double count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            count+=a[i];
        }
        System.out.println((double)count/n);
        sc.close();
    }
}
