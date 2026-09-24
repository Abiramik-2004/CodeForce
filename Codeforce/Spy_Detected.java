import java.util.*;
public class Spy_Detected{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        while(n-->0){
            int k=sc.nextInt();
            int[] a=new int[k];
            for(int j=0;j<k;j++){
                a[j]=sc.nextInt();
            }
            int common;
            if (a[0] == a[1]) {
                common = a[0];
            } else if (a[0] == a[2]) {
                common = a[0];
            } else {
                common = a[1];
            }
            for (int j = 0; j < k; j++) {
                if (a[j] != common) {
                    System.out.println(j+ 1);
                    break;
                }
            }
        }
    }
}