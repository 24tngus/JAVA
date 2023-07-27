// 체스판 다시 칠하기

import java.util.*;

public class baek12_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        boolean[][] board = new boolean[N][M];
        for (int y = 0; y < N; y++) {
            String str = in.nextLine();
            for (int x = 0; x < M; x++) {
                if (str.charAt(x) == 'W')
                    board[y][x] = true;
                else
                    board[y][x] = false;
            }
        }

        int count = 64;
        for (int y = 0; y <= N - 8; y++) {
            for (int x = 0; x <= M - 8; x++) {
                count = Math.min(count, getCount(x, y, board));
            }
        }
        System.out.println(count);
        in.close();
    } 

    public static boolean[][] initBoard(String c) {
        boolean[][] board = new boolean[8][8];
        boolean white = true;

        if (c.equals("W")) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = white;
                    white = !white;
                }
                white = !white;
            }
            return (board);
        } 
        else {
            for (int i = 0; i < 8; i++) {
                white = !white;
                for (int j = 0; j < 8; j++) {
                    board[i][j] = white;
                    white = !white;
                }
            }
            return (board);
        }
    }

    public static int getCount(int x, int y, boolean[][] board) {
        int count_W = 0;
        int count_B = 0;
        boolean[][] board_W = initBoard("W");
        boolean[][] board_B = initBoard("B");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board_W[i][j] != board[y + i][x + j])
                    count_W++;
                if (board_B[i][j] != board[y + i][x + j])
                    count_B++;
            }
        }
        return Math.min(count_W, count_B);
    }
}