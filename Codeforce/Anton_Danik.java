import java.util.*;
public class Anton_Danik {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        int A=0, D=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A')
                A++;
            else if (s.charAt(i)=='D')
                D++;
        }
        if(A>D){
            System.out.println("Anton");
        }
        else if(A<D){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
        sc.close();
    }

    
}
