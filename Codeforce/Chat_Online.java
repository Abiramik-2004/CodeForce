import java.util.*;
public class Chat_Online {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int[][] z=new int[p][2];
        int[][] x=new int[q][2];
        for (int i = 0; i < p; i++) {
            z[i][0] = sc.nextInt();
            z[i][1] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            x[i][0] = sc.nextInt();
            x[i][1] = sc.nextInt();
        }
        int count = 0;
        for (int t = l; t <= r; t++) {
            boolean canChat = false;
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    int xStart = x[j][0] + t;
                    int xEnd = x[j][1] + t;
                    int zStart = z[i][0];
                    int zEnd = z[i][1];
                    if (Math.max(xStart, zStart) <= Math.min(xEnd, zEnd)) {
                        canChat = true;
                        break;
                    }
                }
                if (canChat) {
                    break;
                }
            }
            if (canChat) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
