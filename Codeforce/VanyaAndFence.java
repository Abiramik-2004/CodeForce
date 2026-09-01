import java.util.*;
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fh=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int sh=sc.nextInt();
            if(sh>fh){
                sum+=2;
            }
            else{
                sum+=1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
