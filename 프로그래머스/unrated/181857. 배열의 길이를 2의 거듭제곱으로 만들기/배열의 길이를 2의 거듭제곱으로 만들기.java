import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int leng = arr.length;
        int target = 1;
        
        while (target < leng) { // arr의 길이보다 작은 2의 거듭제곱을 찾는다 (2,4,8...)
            target *= 2; 
        }
        
        int [] answer = new int[target]; // 위에서 구한 거듭제곱의 길이만큼 배열 생성
        Arrays.fill(answer, 0);
        System.arraycopy(arr, 0, answer, 0, leng); // arr를 answer로 배열 복사
        
        return answer;
    }
}