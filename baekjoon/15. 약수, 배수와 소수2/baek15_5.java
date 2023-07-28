// 다음 소수

import java.math.BigInteger;
import java.util.*;

public class baek15_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            long n = in.nextLong();

            // isProbalbePrime()과 nextProbalbePrime()은 BigInteger만 지원
            BigInteger b = new BigInteger(String.valueOf(n));
            if (b.isProbablePrime(10)) {
                System.out.println(n);
            } else {
                System.out.println(b.nextProbablePrime());
            }
        }
        // < 시간 초과 >
        // for (int i = 0; i < N; i++) {
        //     long n = in.nextLong();
        //     if (isPrime(n) == 0) {
        //         System.out.println(n);
        //     } else {
        //         System.out.println(getPrime(n));
        //     }
        // }
        in.close();
    }   

    // public static long isPrime(long n) {
    //     long sqrt = (long)Math.sqrt(n);
    //     for (int i = 2; i <= sqrt; i++) {
    //         if (n % i == 0)
    //             return (1);
    //     }
    //     return (0);
    // }

    // public static long getPrime(long n) {
    //     while (isPrime(n) != 0) {
    //         n++;
    //     }
    //     return(n);
    // }
}
