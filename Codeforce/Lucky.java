import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String ticket = sc.next();

            int firstSum = 0;
            int lastSum = 0;

            for (int i = 0; i < 3; i++) {
                firstSum += ticket.charAt(i) - '0';
            }

            for (int i = 3; i < 6; i++) {
                lastSum += ticket.charAt(i) - '0';
            }

            if (firstSum == lastSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}