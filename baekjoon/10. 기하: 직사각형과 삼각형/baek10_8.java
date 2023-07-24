// 세 막대 

import java.util.*;

public class baek10_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();

        Arrays.sort(arr);
        if (arr[0] + arr[1] > arr[2])
            System.out.println(arr[0] + arr[1] + arr[2]);
        else {
            arr[2] = arr[0] + arr[1] - 1;
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
        in.close();
    }
}