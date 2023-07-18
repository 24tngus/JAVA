// 크로아티아 알파벳

import java.util.*;
// import java.io.*;

public class baek6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.nextLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    
        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i]))
                str = str.replace(arr[i], "0");
        }
        System.out.println(str.length());
        in.close();
    }
}
