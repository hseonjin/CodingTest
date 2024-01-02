class Solution {
    public int solution(String[] strArr) {
        int[] test = new int[31]; // 길이 저장할 배열
        int answer = 0; // 최대값 저장할 변수

        for (String str : strArr) { // 동일한 문자열 길이 세기
            test[str.length()-1]++;
        }

        for (int c : test) { // 최대값 저장
            if (c > answer) {
                answer = c;
            }
        }
        
        return answer;
    }
}