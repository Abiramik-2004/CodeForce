import java.util.*;
public class Next_Round {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] score=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();
            if(score[i] >= score[k - 1] && score[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
