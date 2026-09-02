import java.util.*;

public class horseshoeOnTheHoof {

    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<4;i++){
            int n=sc.nextInt();
            set.add(n);

        }
        int count=4-set.size();
        System.out.println(count);
        sc.close();
    }
}