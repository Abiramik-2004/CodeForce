import java.util.*;
public class GeorgeAccomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            int o=sc.nextInt();
            if(o-s>=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
