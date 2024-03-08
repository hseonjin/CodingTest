class Solution {
    public String[] solution(String[] strArr) {
        // String[] answer = new String[strArr.length()];
        for (int i=0; i<strArr.length; i++) {
            if (i % 2 != 0) strArr[i] = strArr[i].toUpperCase();// 홀수
            else strArr[i] = strArr[i].toLowerCase();
        }
        return strArr;
    }
}