// 수학은 비대면강의입니다

import java.util.*;

public class baek12_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        int x = 0;
        int y = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i + b * j == c) && (d * i + e * j == f)) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        // < 런타임 에러(/by zero) >
        // int y = ((c * d) - (f * a)) / ((b * d) - (e * a));
        // int x = (c - (b * y)) / a;
        System.out.println(x + " " + y);
        in.close();
    } 
}