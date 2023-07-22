// 약수들의 합

import java.util.*;

public class baek9_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int[] factor = new int[N];
        int j = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0)
                factor[j++] = i;
        }
        if (K > j)
            System.out.println(0);
        else
            System.out.println(factor[K - 1]);

        in.close();
    }
}