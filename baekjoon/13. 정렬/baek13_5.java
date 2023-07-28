// 수 정렬하기 3

import java.io.*;
import java.util.*;

public class baek13_5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int num : arr) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
        // < 메모리 초과 > 
        // StringBuilder sb = new StringBuilder();
        // int N = in.nextInt();
        // ArrayList<Integer> list = new ArrayList<> ();

        // for(int i = 0; i < N; i++) {
        //     list.add(in.nextInt());
        // }
        // Collections.sort(list);
        // for (int value : list) {
        //     sb.append(value).append('\n');
        // }
        // System.out.println(sb);

        // <시간 초과 >
        // Arrays.sort(arr);

        // < 시간 초과 >
        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < N - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int tmp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = tmp;
        //         }
        //     }
        // }
    }
}