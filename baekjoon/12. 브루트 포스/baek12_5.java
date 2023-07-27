// 영화감독 숌

import java.util.*;

public class baek12_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 1;
        int num = 666;

        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
        in.close();
    } 
}
