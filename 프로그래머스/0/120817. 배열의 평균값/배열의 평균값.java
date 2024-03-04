class Solution {
    public double solution(int[] numbers) {
        int s = 0;
        int count = numbers.length;
        
        for (int num : numbers) {
            s += num;
        }
        return (double) s/count;
    }
}