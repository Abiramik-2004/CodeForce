import java.util.*;
public class Stones_on_table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        char p=s.charAt(0);
        for(int i=1;i<n;i++){
            char c=s.charAt(n));
            if(c==p){
                count++;
            }
            else{
                p=c;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
