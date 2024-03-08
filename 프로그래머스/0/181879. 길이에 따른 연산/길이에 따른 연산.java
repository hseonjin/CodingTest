class Solution {
    public int solution(int[] num_list) {
        int h = 0, g = 1;
        for(int i=0; i<num_list.length; i++) {
            h += num_list[i];
            g *= num_list[i];
        }
        return (num_list.length >= 11) ? h : g ;
    }
}