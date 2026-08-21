import java.util.*;
public class Bit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int X=0;
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(s.equals("X++")){
                X++;
            }
            else if(s.equals("++X")){
                ++X;
            }
            else if(s.equals("--X")){
                --X;
            }
            else{
                X--;
            }
        }
        System.out.println(X);
    }
}