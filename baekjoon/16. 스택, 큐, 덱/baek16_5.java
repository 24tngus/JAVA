// 도키도키 간식드리미

import java.util.*;
import java.io.*;

public class baek16_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1;
        
        while (!queue.isEmpty())
        {
            if (queue.peek() == start)
            {
                queue.poll();
                start++;
            }
            else if (!stack.isEmpty() && stack.peek() == start)
            {
                stack.pop();
                start++;
            }
            else
                stack.push(queue.poll());
        }
        while (!stack.isEmpty())
        {
            if (stack.peek() == start)
            {
                stack.pop();
                start++;
            }
            else
            {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
