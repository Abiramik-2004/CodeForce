import java.util.*;
public class Lucky_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,c=n,p=0;
        while(c>0){
            int q=n%10;
            p++;
            c=c/10;
            
        }
        while(n>0){
            int q=n%10;
            if(q==4 || q==7){
                count++;
            }
            n=n/10;
            
        }
        if(count==p){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
        
    }
    
}