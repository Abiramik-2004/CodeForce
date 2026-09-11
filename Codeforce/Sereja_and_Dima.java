import java.util.*;
public class Sereja_and_Dima{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sereja=0,Dima=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int takes=0,i=0,j=arr.length-1;
        while(takes<n){
            
            if(takes%2==0){
                if(arr[i]>arr[j]){
                    sereja+=arr[i];
                    i=i+1;
                }
                else{
                    sereja+=arr[j];
                    j=j-1;
                }
            }
            else{
                if(arr[i]>arr[j]){
                    Dima+=arr[i];
                    i=i+1;
                }
                else{
                    Dima+=arr[j];
                    j=j-1;
                }
            }
            takes++;
        }
        System.out.println(sereja+" "+Dima);
    }
}