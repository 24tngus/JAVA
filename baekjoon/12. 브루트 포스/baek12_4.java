// 체스판 다시 칠하기

import java.util.*;

public class baek12_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        boolean[][] board = new boolean[M][N];
        for (int y = 0; y < M; y++) {
            String str = in.nextLine();
            for (int x = 0; x <= N; x++) {
                if (str.charAt(x) == 'W')
                    board[y][x] = true;
                else
                    board[y][x] = false;
            }
        }

        int count = 64;
        for (int y = 0; y <= M - 8; y++) {
            for (int x = 0; x <= N - 8; x++) {
                count = Math.min(count, getCount(x, y, board));
            }
        }
        System.out.println(count);
        in.close();
    } 

    public static int getCount(int x, int y, boolean[][] board) {
        int count = 0;


        return (count);
    }
}