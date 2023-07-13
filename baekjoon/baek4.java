// 공 바꾸기

import java.util.*;

public class baek4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int n = 0; n < N; n++) {
            arr[n] = n + 1;
        }
        for (int n = 0; n < M; n++) {
            int i = in.nextInt();
            int j = in.nextInt();

            int tmp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = tmp;
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
        in.close();
    }
    
}
