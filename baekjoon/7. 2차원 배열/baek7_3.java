// 세로읽기

import java.util.*;

public class baek7_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String str = in.nextLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                // 추가 구문
                if (arr[i][j] == ' ' || arr[i][j] == '\0')
                    continue;
                System.out.print(arr[i][j]);
            }
        }
        in.close();
    }
}
