class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split(""); // 문자를 하나하나 분리하여 배열로 만듦
        for(int idx : indices) { // indices의 모든 idx를 뽑음
            str[idx] = ""; // str의 idx번째 문자
        }
        return String.join("", str);
    }
}
