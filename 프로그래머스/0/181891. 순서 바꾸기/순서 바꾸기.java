import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // n 이후의 원소
        int[] a1 = Arrays.copyOfRange(num_list, n, num_list.length);
        // n 까지의 원소
        int[] a2 = Arrays.copyOfRange(num_list, 0, n);
        // 두 리스트를 이어 붙이기
        int[] answer = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, answer, 0, a1.length);
        System.arraycopy(a2, 0, answer, a1.length, a2.length);
        return answer;
    }
}