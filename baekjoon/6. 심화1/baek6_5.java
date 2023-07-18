// 그룹 단어 체커

import java.util.*;

public class baek6_5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        String str = in.next();
        boolean[] arr = new boolean[26];
        char prev = 0;
            
        for (int j = 0; j < str.length(); j++) {
            int index = str.charAt(j) - 'a';

            if (prev != str.charAt(j)) {
                if (arr[index] == false) {
                    arr[index] = true;
                    prev = str.charAt(j);
                }
                else if (arr[index] == true) {
                    return (false);
                }
            }
        }
        return (true);
    }
}
