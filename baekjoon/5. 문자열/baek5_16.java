// 그대로 출력하기

import java.util.*;

public class baek5_16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(str);
        }
        // < 런타임 에러 발생 >
        // for (int i = 0; i < 100; i++) {
        //     String str = in.nextLine();
        //     System.out.println(str);
        // }
        in.close();
    }
}