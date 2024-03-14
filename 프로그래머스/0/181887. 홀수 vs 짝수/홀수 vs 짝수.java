class Solution {
    public int solution(int[] num_list) {
        int one = 0;
        int two = 0;
        for (int i=0; i<num_list.length; i++) {
            if(i % 2 == 0) two += num_list[i];
            else one += num_list[i];
        }
        
        return one >= two ? one : two;
    }
}