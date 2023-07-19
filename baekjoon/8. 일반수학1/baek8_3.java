// 세탁소 사장 동혁

import java.util.*;

public class baek8_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int C = in.nextInt();
            int q = 0; // quater ($0.25)
            int d = 0; // dime ($0.10)
            int n = 0; // nickel ($0.05)
            int p = 0; // penny ($0.01)

            if (C >= 25) {
                q = C / 25;
                C %= 25;
            }
            if (C >= 10) {
                d = C / 10;
                C %= 10;
            }
            if (C >= 5) {
                n = C / 5;
                C %= 5;
            }
            if (C >= 1) {
                p = C;
                C %= 1;
            }
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        in.close();
    }
}