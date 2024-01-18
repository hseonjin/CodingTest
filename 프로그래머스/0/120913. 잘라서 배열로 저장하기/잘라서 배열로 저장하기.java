class Solution {
    public String[] solution(String my_str, int n) {
        int leng = my_str.length();
        String[] answer = new String[(int)Math.ceil((double) leng / n)];
        
        int j = 0;
        for (int i=0; i < leng; i += n) {
            answer[j++] = my_str.substring(i, Math.min(i+n, leng));
        }
        return answer;
    }
}