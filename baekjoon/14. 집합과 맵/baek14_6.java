// 듣보잡

import java.util.*;
import java.io.*;

public class baek14_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>(); // 사전순 정렬 목적

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
            if (map.get(input) == 2)
                list.add(input);
        }
        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for (String s : list)
            sb.append(s).append("\n");
        System.out.println(sb);
    }
}
