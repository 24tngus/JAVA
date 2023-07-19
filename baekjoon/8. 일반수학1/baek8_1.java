// 진법 변환

import java.util.*;

public class baek8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String N = in.next();
        int B = in.nextInt();
        int result = 0;
        int base = 1;
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if ('A' <= c && c <= 'Z') {
                result += (c - 'A' + 10) * base;
            } else {
                result += (c - '0') * base;
            }
            base *= B;
        }
        System.out.println(result);
        in.close();
    }
}