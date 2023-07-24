// 수학은 체육과목 입니다

import java.util.*;

public class baek10_4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong(); // 입력 1 < n < 10^9
        System.out.println(n * 4); // 둘레 4n
        in.close();
    }
}