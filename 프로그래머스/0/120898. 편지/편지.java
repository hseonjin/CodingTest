class Solution {
    public int solution(String message) {
        String msg = "";
        int answer = 0;
        
        for (char ch : message.toCharArray()) {
            answer += 1;
        }
        
        return answer * 2;
    }
}