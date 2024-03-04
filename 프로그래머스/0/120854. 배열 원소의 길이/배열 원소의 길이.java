import java.util.ArrayList;

class Solution {
    public int[] solution(String[] strlist) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        for (String str : strlist) {
            int len = str.length();
            intList.add(len);
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}