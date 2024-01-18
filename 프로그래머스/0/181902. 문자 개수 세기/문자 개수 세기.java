class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        
        for (char ch : charArr) {
            if ('A' <= ch && ch <= 'Z') {
                answer[ch - 'A']++;
            } else if ('a' <= ch && ch <= 'z') {
                answer[ch -'a' + 26]++; 
            }
        }
        return answer;
    }
}