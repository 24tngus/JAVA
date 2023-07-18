// 문자열 반복

import java.util.*;

public class baek5_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int T = in.nextInt();
        for (int n = 0; n < T; n++) {
            int R = in.nextInt();
            String S = in.next();
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
        }
        in.close();
    }
}
