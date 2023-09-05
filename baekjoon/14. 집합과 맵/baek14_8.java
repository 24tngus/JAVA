// 서로 다른 부분 문자열의 개수

import java.util.*;
import java.io.*;

public class baek14_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<String>();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
