// 녹색거탑

import java.util.*;

public class baek17_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= 2;
        }
        System.out.println(result);
        in.close();
    }
}
