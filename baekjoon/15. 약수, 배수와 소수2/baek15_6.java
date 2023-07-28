// 소수 구하기

import java.math.BigInteger;
import java.util.*;

public class baek15_6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            BigInteger big = new BigInteger(String.valueOf(i)); 
            if (big.isProbablePrime(10)) { // 인자값 : 확실성 정도
                System.out.println(big);
            }
        }
        in.close();
    }   
}
