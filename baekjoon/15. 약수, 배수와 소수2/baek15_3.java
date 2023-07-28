// 분수 합

import java.util.*;

public class baek15_3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int gcf = gcd(a2, b2); // 최대공약수
        int lcm = a2 * b2 / gcf; // 최소공배수

        int a = (lcm / a2) * a1 + (lcm / b2) * b1;
        int b = lcm;
        while (gcd(a, b) != 1) {
            gcf = gcd(a, b);
            b /= gcf;
            a /= gcf;
        }
        System.out.println(a + " " + b);
        in.close();
    }   

    public static int gcd (int a, int b) {

        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return (a);
    }
}
