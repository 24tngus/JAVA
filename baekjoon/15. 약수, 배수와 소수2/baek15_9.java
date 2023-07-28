// 창문 닫기

import java.util.*;

public class baek15_9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();

        int count = 0;
        // 약수가 홀수 인 것 찾기
        // 제곱수만 약수가 홀수
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        System.out.println(count);

        // < 메모리 초과 >
        // long N = in.nextLong();
        // boolean[] arr = new boolean[N + 1];

        // for (int i = 1; i <= N; i++) {
        //     for (int j = i; j <= N; j += i) {
        //         if (arr[j])
        //             arr[j] = false;
        //         else
        //             arr[j] = true;
        //     }
        // }
        // int count = 0;
        // for (int i = 1; i <= N; i++) {
        //     if (arr[i])
        //         count++;
        // }
        // System.out.println(count);
        in.close();
    }   
}
