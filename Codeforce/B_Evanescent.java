import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int answer = n;

            // Delete one character from index 1 to n-2
            for (int i = 1; i < n - 1; i++) {

                int count = 0;
                char prev = '#';

                for (int j = 0; j < n; j++) {

                    // Skip the character we want to delete
                    if (j == i) {
                        continue;
                    }

                    if (s.charAt(j) != prev) {
                        count++;
                        prev = s.charAt(j);
                    }
                }

                answer = Math.min(answer, count);
            }

            System.out.println(answer);
        }

        sc.close();
    }
}