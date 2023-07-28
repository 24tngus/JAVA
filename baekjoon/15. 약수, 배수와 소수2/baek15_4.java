// 가로수

import java.util.*;

public class baek15_4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N ; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int gcf = 0;
        for (int i = 0; i < N - 1; i++) {
            int distance = arr[i + 1] - arr[i];
            gcf = gcd(distance, gcf);   
        }
        System.out.println(((arr[N - 1] - arr[0]) / gcf) + 1 - N);
        in.close();
    }   

    public static int gcd (int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return (a);
    }
}
