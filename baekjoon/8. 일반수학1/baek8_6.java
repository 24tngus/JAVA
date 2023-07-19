// 분수찾기

import java.util.*;

public class baek8_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int X = in.nextInt();
        int sum = 0;
        int cross = 1;

        while (true) {
            if (X <= sum + cross) {
                if (cross % 2 == 1) {
                    System.out.print((cross - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else {
                    System.out.print((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            } else {
                sum += cross;
                cross++;
            }
        }
        in.close();
    }
}