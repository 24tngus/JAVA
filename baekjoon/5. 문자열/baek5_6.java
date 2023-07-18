// 문자와 문자열
import java.util.*;

public class baek5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = in.next().split("");
        int n = in.nextInt();

        System.out.println(arr[n - 1]);

        in.close();
    }
    
}
