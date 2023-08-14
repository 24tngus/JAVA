// 제로

import java.util.*;
import java.io.*;

public class baek16_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        
        int K = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
            {
                if (!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(n);
        }
        while (!stack.isEmpty())
        {
            result += stack.peek();
            stack.pop();
        }
        sb.append(result).append("\n");
        System.out.println(sb);
    }
}
