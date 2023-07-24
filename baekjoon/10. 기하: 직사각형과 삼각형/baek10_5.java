// 대지

import java.util.*;

public class baek10_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min_x = 10000, max_x = -10000;
        int min_y = 10000, max_y = -10000;

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x > max_x)
                max_x = x;
            if (x < min_x)
                min_x = x;
            if (y > max_y)
                max_y = y;
            if (y < min_y)
                min_y = y;
        }
        System.out.println((max_x - min_x) * (max_y - min_y));
        in.close();
    }
}