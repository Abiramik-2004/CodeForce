import java.util.*;
public class hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        if(n==1){
            s=s+"I hate ";
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2==0){
                    s=s+"I hate ";
                }
                else{
                    s=s+"I love ";
                }
                if(i!=n-1){
                    s=s+"that ";
                }
            }
        }
        s=s+"it";
        System.out.println(s);
        sc.close();
    }
}
