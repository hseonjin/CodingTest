import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            arr.add(my_string.substring(i, my_string.length()));
        }
        
        return arr.contains(is_suffix) ? 1 : 0;
    }
}