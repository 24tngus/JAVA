// 알고리즘 수업 - 알고리즘의 수행 시간 6

import java.util.*;

public class baek11_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Long n = in.nextLong();
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
        in.close();
    }
}