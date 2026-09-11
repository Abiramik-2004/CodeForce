import java.util.*;
public class Buy_a_shvel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int total = k * i;
            if (total % 10 == 0 || total % 10 == r) {
                System.out.println(i);
                break;
            }
        }
    }
}
