import java.util.*;
public class Daytona_cost{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int k=sc.nextInt();
            boolean flag=false;
            for(int j=0;j<l;j++){
                int t=sc.nextInt();
                if(t==k){
                    
                    flag=true;
                    
                }
            }
            if(flag==false){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}