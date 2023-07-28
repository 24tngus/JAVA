// 베르트랑 공준

import java.util.*;

public class baek15_7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int N = 123456;
        boolean[] arr = new boolean[2 * N + 1];

        for (int i = 2; i <= 2 * N; i++) {
            arr[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(2 * N); i++) {
            for (int j = i + i; j <= 2 * N; j += i) {
                arr[j] = false;
            }
        }

        while (true) {
            int n = in.nextInt();

            if (n == 0)
                break;
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        // < 시간 초과 >
        // while (true) {
        //     int n = in.nextInt();

        //     if (n == 0)
        //         break;
        //     int count = 0;
        //     for (int i = n + 1; i <= 2 * n; i++) {
        //         BigInteger b = new BigInteger(String.valueOf(i));
        //         if (b.isProbablePrime(10)) {
        //             count++;
        //         }
        //     }
        //     System.out.println(count);
        // }

        in.close();
    }   
}
