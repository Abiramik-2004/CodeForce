import java.util.*;
public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int police=0;
        int untreated=0;
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            if(s==-1){
                if(police>0){
                    police--;
                }
                else{
                    untreated++;
                }
            }
            else{
                police+=s;
            }
        }
        System.out.println(untreated);
    }
}
