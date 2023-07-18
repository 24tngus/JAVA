// 단어의 개수

import java.util.*;

public class baek5_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

        // < 런타임 에러 발생 >
        // int cnt = 0;
        // String str= in.nextLine();
        // str = str.trim();
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == ' ') {
        //         cnt++;
        //     }
        // }
        // if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ')
        //     System.out.println(++cnt);
        // if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ')
        //     System.out.println(--cnt);
        in.close();
    }
}
