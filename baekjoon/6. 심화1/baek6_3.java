// 단어 공부

import java.util.*;

public class baek6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] alpha = new int[26];
        String str = in.next().toUpperCase();
        for(int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'A'] += 1; 
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char)(i + 'A');
            }
            else if (alpha[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
        in.close();
    }    
}
