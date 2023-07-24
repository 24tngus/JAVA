// 소수

import java.util.*;

public class baek9_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        int min = N;
        for (int i = M; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    sum += j;
                    if (j < min)
                        min = j;
                }
                if (i % j == 0)
                    break;
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        in.close();
    }
}