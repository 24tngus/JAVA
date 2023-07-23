// 약수들의 합

import java.util.*;

public class baek9_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            int N = in.nextInt();
            if (N == -1)
                break;
            int[] factor = new int[N];
            int j = 0;
            int sum = 0;

            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && N != i) {
                    factor[j++] = i;
                    sum += i;
                }
            }
            if (sum == N) {
                System.out.print(N + " = 1");
                for(int i = 2; i <= N; i++) {
                    if (factor[i - 1] != 0) {
                        System.out.print(" + " + factor[i - 1]);
                    }
                }
                System.out.println();
            }
            else {
                System.out.println(N + " is NOT perfect.");
            }
        }
        in.close();
    }
}