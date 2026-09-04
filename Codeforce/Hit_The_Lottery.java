import java.util.*;
public class Hit_The_Lottery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bills[]={100,20,10,5,1};
        int count=0;
        for(int bill:bills){
            count+=n/bill;
            n=n%bill;
        }
        System.out.println(count);
    }
}