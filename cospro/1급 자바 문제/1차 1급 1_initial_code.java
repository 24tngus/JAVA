import java.util.*;

class Solution {
    public long solution(long num){
        long answer = num + 1;
        long digit = 1;
        while (answer / digit % 10 == 0)
        {
            answer += digit;
            digit *= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long num = 9949999;
        long ret = sol.solution(num);

        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}