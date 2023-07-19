// 너의 평점은

import java.util.*;

public class baek6_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum_a = 0;
        double result = 0;

        for (int i = 0; i < 20; i++) {
            String str = in.next();
            double a = in.nextDouble();
            String b = in.next();

            sum_a += a;
            if (b.equals("A+")) {
                result += a * 4.5;
            } else if (b.equals("A0")) {
                result += a * 4.0;
            } else if (b.equals("B+")) {
                result += a * 3.5;
            } else if (b.equals("B0")) {
                result += a * 3.0;
            } else if (b.equals("C+")) {
                result += a * 2.5;
            } else if (b.equals("C0")) {
                result += a * 2.0;
            } else if (b.equals("D+")) {
                result += a * 1.5;
            } else if (b.equals("D0")) {
                result += a * 1.0;
            } else if (b.equals("P")) {
                sum_a -= a;
            }
        }
        System.out.printf("%.6f", result / sum_a);
        in.close();
    }
}
