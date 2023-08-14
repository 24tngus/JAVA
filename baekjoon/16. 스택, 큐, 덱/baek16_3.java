// 괄호

import java.util.*;
import java.io.*;

public class baek16_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            sb.append(isPS(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    public static String isPS(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                stack.push(c);
            else if (c == ')') {
                if (stack.empty())
                    return ("NO");
                else
                    stack.pop();
            }
        }

        if (stack.empty())
            return ("YES");
        else
            return ("NO");
    }
}
