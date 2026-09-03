import java.util.*;
public class I_Wanna_Be_The_guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<k;i++){
            int t=sc.nextInt();
            s.add(t);
        }
        int l=sc.nextInt();
        for(int i=0;i<l;i++){
            int t=sc.nextInt();
            s.add(t);
        }
        if(n==s.size()){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}
