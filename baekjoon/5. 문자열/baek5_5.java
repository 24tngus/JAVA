// 바구니 뒤집기

import java.util.*;

public class baek5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];
        for (int n = 0; n < N; n++)
            arr[n] = n + 1;

        for (int n = 0; n < M; n++) {
            int i = in.nextInt();
            int j = in.nextInt();

            for (int m = i; m < j; m++, j--) {
                int tmp = arr[m - 1];
                arr[m - 1] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
        in.close();

        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}
