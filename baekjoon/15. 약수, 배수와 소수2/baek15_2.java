// 최소공배수

import java.util.*;

public class baek15_2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();

        long r = gcd(a, b);
        System.out.println(a * b / r);
        in.close();
    }   

    public static long gcd(long a, long b) {

        while (b != 0) {
            long r = a % b;

            a = b;
            b = r;
        }
        return (a);
    }
}
