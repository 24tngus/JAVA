// 팰린드롬인지 확인하기

import java.util.*;

public class baek6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int result = 1;
        for(int i = 0; i < (str.length() / 2); i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - i - 1);
            if (c1 != c2) {
                result = 0;
                break ;
            }
        }
        System.out.println(result);
        in.close();
    }
}
