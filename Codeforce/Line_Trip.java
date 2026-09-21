import java.util.*;

public class Line_Trip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int previous = 0;
            int answer = 0;

            for (int i = 0; i < n; i++) {

                int station = sc.nextInt();

                int gap = station - previous;

                answer = Math.max(answer, gap);

                previous = station;
            }

            // Last station -> x -> last station
            int lastGap = x - previous;

            answer = Math.max(answer, 2 * lastGap);

            System.out.println(answer);
        }
    }
}