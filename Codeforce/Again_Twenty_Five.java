import java.util.*;
public class Again_Twenty_Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double s=5;
        double res=Math.pow(s,n);
        int count=0;
        String t="";
        while(count!=2){
            int q=(int)res%10;
            res=res/10;
            t=q+t;
            count++;

        }
        int num=Integer.parseInt(t);
        System.out.println(num);
    }
}
