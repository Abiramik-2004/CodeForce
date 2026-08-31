/**
 * Presents
 */
import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int[] giver=new int[n];
        for (int i = 0; i < n; i++) {
            giver[p[i] - 1] = i + 1;
        }
        for(int i=0;i<n;i++){
            System.out.print(giver[i]+" ");
        }
        sc.close();
        
    }
    
}