// 색종이

import java.util.*;

public class baek7_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 0;
        int[][] arr = new int[100][100];

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            for (int a = x; a < x + 10; a++) {
                for (int b = y; b < y + 10; b++) {
                    arr[a][b] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
        }
        System.out.println(count);
        in.close();
    }    
}
