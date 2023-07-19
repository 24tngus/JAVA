// 최댓값

import java.util.*;

public class baek7_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int max_i = 0;
        int max_j = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((max_i + 1) + " " + (max_j + 1));
        in.close();
    }
}