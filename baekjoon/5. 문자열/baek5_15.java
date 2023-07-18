// 다이얼

import java.util.*;

public class baek5_15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = 0;
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C')
                cnt += 3;
            else if (c == 'D' || c == 'E' || c == 'F')
                cnt += 4;
            else if (c == 'G' || c == 'H' || c == 'I')
                cnt += 5;
            else if (c == 'J' || c == 'K' || c == 'L')
                cnt += 6;
            else if (c == 'M' || c == 'N' || c == 'O')
                cnt += 7;
            else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S')
                cnt += 8;
            else if (c == 'T' || c == 'U' || c == 'V')
                cnt += 9;
            else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z')
                cnt += 10;
        }
        System.out.println(cnt);
        in.close();
    }
}