// 알고리즘 수업 - 알고리즘의 수행 시간 5

import java.util.*;

public class baek11_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        // for문 3개 있을 경우 : O(n^3)의 시간 복잡도
        System.out.println(n * n * n);
        System.out.println(3);
        in.close();
    }
}