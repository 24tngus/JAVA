// 이항 계수 1

import java.util.*;

public class baek17_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
        in.close();
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 2; i--) {
            result *= i;
        }
        return (result);
    }
}
