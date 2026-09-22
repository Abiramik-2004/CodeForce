import java.util.*;
public class Codeforces_Checking {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="codeforces";
        for(int i=0;i<n;i++){
            char c=sc.next().charAt(0);
            if(s.contains(c+"")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
