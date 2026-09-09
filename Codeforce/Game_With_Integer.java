import java.util.*;
public class Game_With_Integer {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}
