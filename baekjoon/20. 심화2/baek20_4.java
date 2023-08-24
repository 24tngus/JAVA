// 통계학

import java.util.*;
import java.io.*;

public class baek20_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double sum = 0; // int 금지
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        
        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean flag = false;
        for(int i = 0; i < N - 1; i++) {
            if (arr[i] == arr[i + 1])
                count++;
            else
                count = 0;

            if (max < count) {
                max = count;
                mod = arr[i];
                flag = true;
            } 
            else if (max == count && flag == true) {
                mod = arr[i];
                flag = false;
            }
        }
        System.out.println(Math.round(sum / N));
        System.out.println(arr[(N - 1) / 2]);
        System.out.println(mod);
        System.out.println(arr[N - 1] - arr[0]);
    }
}