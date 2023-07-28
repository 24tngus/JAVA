// 최소공배수

import java.util.*;

public class baek15_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int r = gcd(a, b);
            System.out.println(a * b / r);
        }

        // < 시간 초과 >
        // for (int i = 0; i < N; i++) {
        //     int A = in.nextInt();
        //     int B = in.nextInt();
        //     for (int j = 2; j <= A * B; j++) {
        //         if ((j % A == 0) && (j % B == 0)) {
        //             System.out.println(j);
        //             break;
        //         }
        //     }
        // }
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
