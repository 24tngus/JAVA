// 직사각형에서 탈출

import java.util.*;

public class baek10_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int min_x = w - x;
        int min_y = h - y;

        if (min_x > x)
            min_x = x;
        if (min_y > y)
            min_y = y;
        System.out.println(min_x > min_y ? min_y : min_x);
        in.close();
    }
}