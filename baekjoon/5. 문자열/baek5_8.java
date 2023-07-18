// 문자열

import java.util.*;

public class baek5_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String[] arr = in.next().split("");
            System.out.println(arr[0] + arr[arr.length - 1]);
        }

        in.close();
    }
}
