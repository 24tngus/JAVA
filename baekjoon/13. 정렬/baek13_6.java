// 소트인사이드

import java.util.*;

public class baek13_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] arr = in.next().toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        // < 성공 >
        // int N = in.nextInt();
        // int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        // int i = 0;
        // int base = 10;

        // while (N != 0) {
        //     arr[i++] = N % base;
        //     N /= base;
        // }
        // Arrays.sort(arr);
        // for (int j = 9;  j >= 0; j--) {
        //     if (arr[j] >= 0)
        //         System.out.print(arr[j]);
        // }
        in.close();
    }
}