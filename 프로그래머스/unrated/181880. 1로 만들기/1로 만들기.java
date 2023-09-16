class Solution {
    public int solution(int[] num_list) {
        int answer = 0; // 연산 횟수를 기록할 변수

        for(int i=0; i<num_list.length; i++) {
            while (num_list[i] != 1) { // 각 원소가 1이 될 때까지
                if (num_list[i] % 2 == 0) { // 짝수일 때
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}