class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) { // [0,1], [1,2], [2,3]
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}