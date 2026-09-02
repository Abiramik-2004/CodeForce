import java.util.*;
public class Divisibility_problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            int div=sc.nextInt();
            int q=d%div;
            if(q!=0){
                System.out.println(div-q);
            }
            else{
                System.out.println(q);
            }
            sc.close();
        }
    }
}