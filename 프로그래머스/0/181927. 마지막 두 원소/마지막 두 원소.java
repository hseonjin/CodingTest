import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] nums = Arrays.copyOf(num_list, leng + 1);

        if (leng >= 2) {
            if (num_list[leng - 1] > num_list[leng - 2]) {
                nums[leng] = num_list[leng - 1] - num_list[leng - 2];
            } else {
                nums[leng] = num_list[leng - 1] * 2;
            }
        } else {
            nums[leng] = num_list[leng - 1] * 2;
        }

        return nums;
    }
}