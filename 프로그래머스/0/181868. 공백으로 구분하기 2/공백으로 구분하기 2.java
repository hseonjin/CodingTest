import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        
        for (String str : answer) {
            if(!str.isEmpty()) arr.add(str);
        }
        
        return arr.toArray(new String[0]);
    }
}