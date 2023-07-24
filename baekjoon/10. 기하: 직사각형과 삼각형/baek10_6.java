// 삼각형 외우기

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class baek10_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if ((a + b + c) == 180) {
            if (a == b && b == c)
                System.out.print("Equilateral");
            else if (a == b || b == c || c == a)
                System.out.print("Isosceles");
            else
                System.out.print("Scalene");
        }
        else
            System.out.print("Error");
        in.close();
    }
}