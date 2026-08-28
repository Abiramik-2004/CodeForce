import java.util.*;
public  class Petya_and_Strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length()>=0 && s1.length()<=100 && s2.length()>=0 && s2.length()<=100){
             if (s1.compareTo(s2) < 0) {
                System.out.println("-1");
            } 
            else if (s1.compareTo(s2) > 0) {
                System.out.println("1");
            } 
            else {
                System.out.println("0");
            }
        }
        sc.close();

    }
}