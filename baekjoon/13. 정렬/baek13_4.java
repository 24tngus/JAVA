// 수 정렬하기 2

import java.util.*;

public class baek13_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);

        for (int value :  list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
        // < 시간 초과 > - dual_pivot_Quicksort 사용 (시간복잡도 : O(nlogn), 최악 : O(n2))
        // Arrays.sort(arr);

        // < 시간 초과 > - bubble sort (시간복잡도 : O(n2))
        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < N - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int tmp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = tmp;
        //         }
        //     }
        // }
        in.close();
    }
}