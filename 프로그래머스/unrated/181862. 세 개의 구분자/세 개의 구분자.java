import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>(); // 결과를 담을 리스트
        StringBuilder sb = new StringBuilder();
        for(char str : myStr.toCharArray()) {
            if(str=='a' || str=='b' || str == 'c') { // 문자가 a/b/c인 경우
                if(sb.length() > 0) {
                    result.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(str);
            }
        }
        
        if(sb.length() > 0) {
            result.add(sb.toString());
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}