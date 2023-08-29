// 

import java.util.*;

public class baek14_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        Set<String> set = new HashSet<String>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }
        
        System.out.println(set.size());
        in.close();
    }
}
