// 블랙잭

import java.util.*;

public class baek12_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M && max < sum)
                        max = sum;
                }
            }
        }
        System.out.println(max);
        in.close();
    } 
}