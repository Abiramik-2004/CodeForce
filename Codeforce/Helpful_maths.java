import java.util.*;

public class Helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int one = 0, two = 0, three = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')
                one++;
            else if (c == '2')
                two++;
            else if (c == '3')
                three++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < one; i++) {
            if (result.length() > 0) result.append("+");
            result.append("1");
        }

        for (int i = 0; i < two; i++) {
            if (result.length() > 0) result.append("+");
            result.append("2");
        }

        for (int i = 0; i < three; i++) {
            if (result.length() > 0) result.append("+");
            result.append("3");
        }

        System.out.println(result);
        sc.close();
    }
}