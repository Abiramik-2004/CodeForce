import java.util.*;

public class Tram{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inside = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {

            int exit = sc.nextInt();
            int enter = sc.nextInt();

            inside -= exit;
            inside += enter;
            maxCapacity = Math.max(maxCapacity, inside);
        }

        System.out.println(maxCapacity);

        sc.close();
    }
}