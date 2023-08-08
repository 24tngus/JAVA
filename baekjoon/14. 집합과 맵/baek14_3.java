// 회사에 있는 사람

import java.io.*;
import java.util.*;

public class baek14_3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            if (map.containsKey(key))
                map.remove(key);
            else
                map.put(key, value);
        }
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for (var value : list)
            System.out.println(value + " ");
    }
}
