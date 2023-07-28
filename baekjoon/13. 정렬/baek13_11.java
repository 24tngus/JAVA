// 좌표 압축

import java.util.*;

public class baek13_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        int[] sort = new int[N];
        HashMap<Integer, Integer> RankMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            sort[i] = arr[i] = in.nextInt();
        }
        Arrays.sort(sort);

        int rank = 0;
        for (int value : sort) {
            if (!RankMap.containsKey(value)) {
                RankMap.put(value, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            int n = RankMap.get(key);
            sb.append(n).append(' ');
        }
        System.out.println(sb);

        // < 시간 초과 >
        // int N = in.nextInt();
        // int[] arr = new int[N];
        // int[] sort = new int[N];

        // int count = 0;
        // for (int i = 0; i < N; i++) {
        //     arr[i] = in.nextInt();
        //     if (isChar(sort, arr[i], count) != 1) {
        //         sort[count++] = arr[i];
        //     }
        // }
        // int[] cut = new int[count];
        // cut = Arrays.copyOfRange(sort, 0, count);

        // Arrays.sort(cut);
        // for (int i = 0; i < N; i++) {
        //     int n = arr[i];
        //     System.out.print(isChar(cut, n, count) + " ");
        // }
        in.close();
    }

    // public static int isChar(int[] sort, int n, int count) {
    //     for (int i = 0; i < count; i++) {
    //         if (sort[i] == n) {
    //             return (i);
    //         }
    //     }
    //     return (0);
    // }
}