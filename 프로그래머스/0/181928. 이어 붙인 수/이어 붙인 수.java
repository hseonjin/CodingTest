class Solution {
    public int solution(int[] num_list) {
        String even = "";  
        String odd = "";   

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                odd += num_list[i];
            } else {
                even += num_list[i]; 
            }
        }

        int answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;

    }
}