// 균형잡힌 세상

import java.util.*;
import java.io.*;

public class baek16_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true) {
            s = br.readLine();

            if (s.equals("."))
                break;

            sb.append(isPS(s)).append('\n');
        }
        System.out.println(sb);
    }

    public static String isPS(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')')
            {
                if (stack.isEmpty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            }
            else if (c == ']')
            {
                if (stack.isEmpty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }
        if (stack.isEmpty())
            return "yes";
        else
            return "no";
    }
}
