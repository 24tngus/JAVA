// 단어 정렬

import java.util.*;

public class baek13_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String[] arr = new String[N];

        // 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = in.next();
        }

        // 순서대로 정렬 (길이 -> 사전)
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else { 
                    return s1.length() - s2.length();
                }
            }
        });
        
        // 중복 제거 및 출력
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1]))
                System.out.println(arr[i]);
        }
        in.close();
    }
}