// 스택 2

import java.io.*;
import java.util.*;

public class baek16_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("1"))
                stack.push(Integer.parseInt(st.nextToken()));
            else if (cmd.equals("2"))
            {
                if (!stack.isEmpty())
                {
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                }
                else
                    sb.append(-1).append("\n");
            }
            else if (cmd.equals("3"))
                sb.append(stack.size()).append("\n");
            else if (cmd.equals("4"))
            {
                if (!stack.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(1).append("\n");
            }
            else if (cmd.equals("5"))
            {
                if (!stack.isEmpty()) 
                    sb.append(stack.lastElement()).append("\n");
                else
                    sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
