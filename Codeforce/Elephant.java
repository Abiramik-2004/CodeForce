import java.util.*;
public class Elephant{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            if(n>=5){
                n=n-5;
                count++;
            }
            else if(n>=4){
                n=n-4;
                count++;
            }
            else if(n>=3){
                n=n-3;
                count++;
            }
            else if(n>=2){
                n=n-2;
                count++;
            }
            else{
                n=n-1;
                count++;
            }
        }
        System.out.println(count);
    }
}