class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i : array) {
            String num = String.valueOf(i);
            
            for (char ch : num.toCharArray()) {
                if (ch == '7') answer++;
            }
        }
        return answer;
    }
}