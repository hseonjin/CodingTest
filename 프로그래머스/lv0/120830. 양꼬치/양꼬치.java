class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (n>=10) ? n*12000 + (k-(n/10))*2000 : n*12000 + k*2000;
        return answer;
    }
}