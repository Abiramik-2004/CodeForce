import java.util.*;

public class Beautiful_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        y++;

        while (true) {
            String s = String.valueOf(y);
            boolean distinct = true;

            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        distinct = false;
                        break;
                    }
                }

                if (!distinct) {
                    break;
                }
            }

            if (distinct) {
                System.out.println(y);
                break;
            }

            y++;
        }
        sc.close();
    }
}