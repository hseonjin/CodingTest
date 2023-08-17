class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        String[] numList = number.split("");
        
        for(int i=0; i<numList.length; i++) {
            answer += Integer.valueOf(numList[i]);
        }
        return answer;
    }
}