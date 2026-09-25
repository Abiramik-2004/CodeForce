
import java.util.*;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] arr = {a, b, c};

            Arrays.sort(arr);

            System.out.println(arr[1]);
        }

        sc.close();
    }
}

