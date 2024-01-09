import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        int[] prev = Arrays.copyOf(arr, arr.length); 

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            boolean isEqual = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != prev[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                break; 
            } else {
                prev = Arrays.copyOf(arr, arr.length); 
                count++; 
            }
        }
        return count;
    }
}