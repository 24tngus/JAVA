// 네 번째 점

import java.util.*;

public class baek10_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x[] = new int[3];
        int y[] = new int[3];

        int xx = 0;
        int yy = 0;
        for (int i = 0; i < 3; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        if (x[0] == x[1])
            xx = x[2];
        else if (x[0] == x[2])
            xx = x[1];
        else if (x[1] == x[2])
            xx = x[0];
        if (y[0] == y[1])
            yy = y[2];
        else if (y[0] == y[2])
            yy = y[1];
        else if (y[1] == y[2])
            yy = y[0];
        System.out.println(xx + " " + yy);
        in.close();
    }
}