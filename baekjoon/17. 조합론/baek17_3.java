// 팩토리얼

import java.util.*;

public class baek17_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int result = 1;
        for (int i = N; i >= 2; i--) {
            result *= i;
        }
        System.out.println(result);
        in.close();
    }
}
