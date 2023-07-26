// 알고리즘 수업 - 점근적 표기 1

import java.util.*;

public class baek11_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a0 = in.nextInt();
        int c = in.nextInt();
        int n0 = in.nextInt();
        
        if (a1 * n0 + a0 <= c * n0 && c >= a1)
            System.out.println(1);
        else
            System.out.println(0);
        in.close();
    }
}