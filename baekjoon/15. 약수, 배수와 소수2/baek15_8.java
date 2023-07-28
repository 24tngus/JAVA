// 골드바흐 파티션

import java.util.*;

public class baek15_8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        boolean[] arr = new boolean[1000000 + 1];
        arr[0] = arr[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    arr[j] = true;
                }
            }
        }

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int count = 0;

            for (int j = 2; j <= n / 2; j++) {
                if (!arr[j] && !arr[n - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }   
}
