import java.util.*;
public class Beautifu_matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n[][]=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                n[i][j]=sc.nextInt();
                if(n[i][j]==1){
                    int moves = Math.abs(i - 2) + Math.abs(j - 2);
                    System.out.println(moves);
                }
            }
        }
        sc.close();
    }
}
