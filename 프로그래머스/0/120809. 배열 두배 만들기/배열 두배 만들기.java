import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : numbers) {
            num *= 2;
            arrList.add(num);
        }
        
        int[] answer = new int[arrList.size()];
        for (int i=0; i<arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}