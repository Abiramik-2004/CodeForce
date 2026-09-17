import java.util.*;
public class Restoring_Three_Num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] ar=new int[4];
        for(int i=0;i<4;i++){
            ar[i]=sc.nextInt();

        }
        Arrays.sort(ar);
        int total=ar[3];
        int a = total - ar[0];
        int b = total - ar[1];
        int c = total - ar[2];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}