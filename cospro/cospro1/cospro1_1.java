package cospro1;

class Solution {
    public long solution(long num){
        long answer = num + 1;
        long i = 1;
        while (answer / i % 10 == 0) {
            answer += i;
            i *= 10;
        }
        return answer;
    }
}
public class cospro1_1 {
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        long num = 9949999;
        long ret = sol.solution(num);

        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}