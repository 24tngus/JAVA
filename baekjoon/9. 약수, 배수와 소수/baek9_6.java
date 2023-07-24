// 소인수분해

import java.util.*;

public class baek9_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        while(true) {
            if (N <= 1)
                break;
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N /= i;
                    System.out.println(i);
                    break;
                }
            }
        }
        in.close();
    }
}