class Solution {
    public int[] solution(int[] arr, int n) {
        // arr의 길이가
        int leng = arr.length;
        // 홀수이면 짝수 인덱스 위치에 +n
        if (leng % 2 != 0) {
            for (int i=0; i<arr.length; i+=2) {
                arr[i] += n;
            }
        } else {
            for (int i=1; i<arr.length; i+=2) {
                arr[i] += n;
            }
        }
        // 짝수라면 홀수 인덱스 위치에 +n
        return arr;
    }
}