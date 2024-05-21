class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        if (numStr.contains(kStr)) {
            return numStr.indexOf(kStr) + 1;
        } else {
            return -1;
        }
    }
}