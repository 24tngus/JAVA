// 나는야 포켓몬 마스터 이다솜

import java.util.*;
import java.io.*;

public class baek14_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> smap = new HashMap<>();
        Map<Integer, String> imap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            smap.put(name, i);
            imap.put(i, name);
        }
        for (int i = 1; i <= M; i++) {
            String str = br.readLine();
            if (isNum(str)) {
                System.out.println(imap.get(Integer.parseInt(str)));
            } else {
                System.out.println(smap.get(str));
            }
        }
    }
    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
