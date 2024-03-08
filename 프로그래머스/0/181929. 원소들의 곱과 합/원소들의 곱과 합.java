class Solution {
    public int solution(int[] num_list) {
        int h = 0, g = 1;
        
        for (int i : num_list) {
            h += i;
            g *= i;
        }
        return (g < h*h) ? 1 : 0;
    }
}