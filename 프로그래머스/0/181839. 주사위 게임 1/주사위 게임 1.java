class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 0 && b % 2 == 0) { // 모두 짝수 |a-b|
            answer = Math.abs(a-b);
        } else if (a % 2 != 0 && b % 2 != 0) { // 모두 홀수 a^2+b^2
            answer = (int)(Math.pow(a, 2) + Math.pow(b, 2));
        } else {
            answer = 2 * (a+b);
        }
        return answer;
    }
}