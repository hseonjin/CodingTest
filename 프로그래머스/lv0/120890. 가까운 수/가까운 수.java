import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); // 정렬

        for(int i=1; i<array.length; i++) {
            if(array[i] >= n) { 
                int pre = n - array[i-1]; // 인덱스 전의 값과 n 비교
                int next = array[i] - n; // 인덱스 후의 값과 n 비교
                return pre <= next ? array[i-1] : array[i]; // 후의 값이 전 값보다 크거나 같으면 작은수(pre), 작다면 큰수(next)
            }
        }

        return array[array.length - 1];

    }
}