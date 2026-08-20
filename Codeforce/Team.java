import java.util.*;
public class Team {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prob=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<3;j++){
                int p=sc.nextInt();
                if(p==1){
                    count++;
                }
            }
            if(count>=2){
                prob++;
            }
        }
        System.out.println(prob);
    }
}
