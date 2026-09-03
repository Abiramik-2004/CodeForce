import java.util.*;
public class Arrival_of_general {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]<=a[min]){
                min=i;
            }
        }
        int result=max+(n-1-min);
        if(max>min){
            result--;
        }
        System.out.println(result);
        sc.close();
    }
}
