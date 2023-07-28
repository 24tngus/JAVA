// 대표값2

import java.util.*;

public class baek13_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println((int)(sum / 5));
        System.out.println(arr[2]);
        in.close();
    }
}
