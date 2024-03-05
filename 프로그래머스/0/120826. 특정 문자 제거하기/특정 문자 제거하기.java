class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();
        char cletter = letter.charAt(0);
        
        for (char ch : my_string.toCharArray()) {
            if (ch != cletter) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}