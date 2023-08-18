// 숫자 카드 2

import java.util.*;
import java.io.*;

public class baek14_5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<Integer, Integer> map = new HashMap<>();

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());
            if (map.get(m) == null)
                map.put(m, 1);
            else
                map.put(m, map.get(m) + 1);
        }
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (map.get(n) == null)
                sb.append(0).append(" ");
            else
                sb.append(map.get(n)).append(" ");
        }
        System.out.println(sb);
    }
}
