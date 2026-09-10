import java.util.*;
public class Division{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            if(s<=1399){
                System.out.println("Division 4");
            }
            else if(s<=1599){
                System.out.println("Division 3");
            }
            else if(s<=1899){
                System.out.println("Division 2");
            }
             else if(s>=1900){
                System.out.println("Division 1");
            }
        }
    }
}