class Solution {
    public int solution(int num1, int num2) {
        double q = (double) num1 / num2;
        int answer = (int) (q * 1000); 
        return answer;
    }
}