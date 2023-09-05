// 대칭 차집합

import java.util.*;
import java.io.*;

public class baek14_7 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set_A = new HashSet<>();
        Set<Integer> set_B = new HashSet<>();
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            int n = Integer.parseInt(st.nextToken());
            set_A.add(n);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            int n = Integer.parseInt(st.nextToken());
            set_B.add(n);
        }

        int result = 0;
        for (int num : set_A) {
            if (!set_B.contains(num))
                result++;
        }
        for (int num : set_B) {
            if (!set_A.contains(num))
                result++;
        }
        System.out.println(result);
    }
}
