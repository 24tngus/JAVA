// 배수와 약수

import java.util.*;

public class baek9_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A == 0 && B == 0)
                break;
            if (B % A == 0)
                System.out.println("factor");
            else if (A % B == 0)
                System.out.println("multiple");
            else 
                System.out.println("neither");
        }
        in.close();
    }
}