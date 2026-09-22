import java.util.*;
public class Blank_Space{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int count=0,maxcount=0;
            for(int j=0;j<l;j++){
                int k=sc.nextInt();
                if(k==0){
                    count++;
                }
                else{
                    count=0;
                }
                maxcount=Math.max(count, maxcount);
            }
           
            System.out.println(maxcount);
        }
        sc.close();
    }
}