// 중앙 이동 알고리즘

import java.util.*;

public class baek8_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // ((p - 1) + p^2)
        int p = 2;

        for (int i = 1; i <= N; i++) {
            p = (p - 1) + p;
        }
        System.out.println(p * p);
        in.close();
    }
}