class Solution {
    public int solution(int n) {
        if (n % 7 == 0) return n/7;
        else return (int) n/7+1;
    }
}