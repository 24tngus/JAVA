// 알고리즘 수업 - 알고리즘의 수행 시간 4

import java.util.*;

public class baek11_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        // 1부터 n-1 까지, i+1qnxj n까지 반복 
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
        in.close();
    }
}