//알파벳 찾기

import java.util.*;

public class baek11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int[] arr = new int[26];
        for (int i=0; i < 26; i++)
            arr[i] = -1;
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1)
                arr[c - 'a'] = i;
        }
        for (int i = 0; i < 26; i++)
            System.out.print(arr[i] + " ");
        in.close();
    }
}