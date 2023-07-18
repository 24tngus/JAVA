// 상수

import java.util.*;

public class baek5_14 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        a = (a % 10) * 100 + ((a % 100) / 10) * 10 + (a / 100);
        b = (b % 10) * 100 + ((b % 100) / 10) * 10 + (b / 100);
        System.out.println(a > b ? a : b);
        in.close();
    }
}
