// 벌집

import java.util.*;

public class baek8_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int result = 1;
        int room = 2;
        // 1 : 1 
        // 2 : 2 ~ 7 (+ 6)
        // 3 : 8 ~ 19 (+ 12)
        // 4 : 20 ~ 37 (+ 18)
        // 5 : 38 ~ 61 (+ 24)
        if (N != 1) {
            while (room <= N) {
                room += 6 * result;
                result++;
            }
        }
        System.out.println(result);
        in.close();
    }
}