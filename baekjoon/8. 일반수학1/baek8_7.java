// 달팽이는 올라가고 싶다

import java.io.*;
import java.util.*;

public class baek8_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int count = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0)
            count++;
        System.out.println(count);
        // < 시간 초과 >
        // Scanner in = new Scanner(System.in);

        // int A = in.nextInt();
        // int B = in.nextInt();
        // int V = in.nextInt();
        // int height = 0;
        // int count = 1;

        // while (height <= V) {
        //     if (height + A >= V) 
        //         break;
        //     height += A - B;
        //     count++;
        // }
        // System.out.println(count);
        // in.close();
    }
}