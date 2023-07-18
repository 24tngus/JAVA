// 숫자의 합

import java.util.*;

public class baek5_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[] arr = in.next().split("");
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);

        in.close();
    }
}
