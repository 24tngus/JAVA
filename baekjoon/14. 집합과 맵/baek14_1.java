// 숫자 카드

import java.io.*;
import java.util.*;

public class baek14_1  {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count_N = Integer.parseInt(br.readLine());
        int[] N = new int[count_N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count_N; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N);

        int count_M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0;  i < count_M; i++) {
            int search = Integer.parseInt(st.nextToken());
            System.out.print(binary_search(N, count_N, search) + " ");
        }
    }
    public static int binary_search(int[] N, int count, int search) {
        int first = 0;
        int last = count - 1;

        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (N[mid] == search)
                return (1);
            if (N[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return (0);
    }
}
