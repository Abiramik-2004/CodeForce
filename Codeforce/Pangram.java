import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        s = s.toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}