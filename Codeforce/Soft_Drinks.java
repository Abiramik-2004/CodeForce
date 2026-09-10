import java.util.*;
public class Soft_Drinks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int drink=(k*l)/nl;
        int slice=c*d;
        int salt=p/np;
        int op=Math.min(drink,Math.min(slice,salt));
        System.out.println(op/n);
    }
}