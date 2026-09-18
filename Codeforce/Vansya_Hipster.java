import java.util.*;

public class Vansya_Hipster {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int different = Math.min(a, b);
        int same = Math.abs(a - b) / 2;

        System.out.println(different + " " + same);
    }
}