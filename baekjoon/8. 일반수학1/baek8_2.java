// 진법 변환 2

import java.util.*;

public class baek8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int B = in.nextInt();
        char[] result = new char[36];
        int i = 0;
        if (N == 0) {
            result[i++] = (char)('0');
        }
        while (N > 0) 
        {
            if (N % B < 10) {
                result[i++] = (char)(N % B + '0');
            } else {
                result[i++] = (char)(N % B + 'A' - 10);
            }
            N /= B;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(result[j]);
        }
        in.close();
    }
}
