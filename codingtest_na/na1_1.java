// 전구

import java.util.*;
import java.io.*;

public class na1_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count_l = Integer.parseInt(st.nextToken());
        int count_c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()); // 입력
        int[] light = new int[count_l];
        for (int i = 0; i < count_l; i++) {
            light[i] = Integer.parseInt(st.nextToken());
        }
        int[][] command = new int[count_c][3];
        for (int i = 0; i < count_c; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                command[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < count_c; i++) {
            int c = command[i][0];
            int l = command[i][1] - 1;
            int r = command[i][2] - 1;
            if (c == 1) {
                int ii = command[i][1] - 1;
                int x = command[i][2];
                light[ii] = x;
            } else if (c == 2) {
                for (int j = l; j <= r; j++) {
                    if (light[j] == 0)
                        light[j] = 1;
                    else
                        light[j] = 0;
                }
            } else if (c == 3) {
                for (int j = l; j <= r; j++) {
                    light[j] = 0;
                }
            } else if (c == 4) {
                for (int j = l; j <= r; j++) {
                    light[j] = 1;
                }
            }
        }

        for (int i = 0; i < count_l; i++) {
            System.out.print(light[i] + " ");
        }
    }
}
