import java.util.*;
public class Soldier_And_Bannanas {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int tot=k;
        for(int i=2;i<=w;i++){
            tot+=k*i;
        }
        if(tot>n){
            System.out.println(tot-n);
        }
        else{
            System.out.println(0);
        }
        sc.close();
    }

}
