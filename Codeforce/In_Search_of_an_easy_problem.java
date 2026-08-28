import java.util.*;
public class In_Search_of_an_easy_problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="Easy";
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==1){
                s="Hard";
            }
            

        }
        System.out.println(s);
        sc.close();
    }
       
}
