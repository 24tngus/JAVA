// 소수 찾기

import java.util.*;

public class baek9_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		int N = in.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = in.nextInt();

            for (int j = 2; j <= num; j++) {
                if (j == num)
                    count++;
                if (num % j == 0)
                    break;
            }
        }
        System.out.println(count);
        in.close();
    }
}
