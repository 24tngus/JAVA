// 공 넣기

import java.util.*;

public class baek5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];
        
        for (int a = 0; a < M; a++)
        {
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();

            for (int b = i - 1; b < j; b++)
            {
                arr[b] = k;
            }
        }
        in.close();

        for (int n = 0; n < arr.length; n++)
            System.out.print(arr[n] + " ");
    }
    
}
