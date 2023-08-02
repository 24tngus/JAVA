// 다리 놓기

import java.util.*;

public class baek17_5 {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int M = in.nextInt();

            sb.append(combi(M, N)).append('\n');
        }
        System.out.println(sb);
        in.close();
    }

    public static int combi(int n, int r) {
        if (dp[n][r] > 0) {
            return (dp[n][r]);
        }

        if (n == r || r == 0) {
            return(dp[n][r] = 1);
        }

        return (dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r));
    }
}
