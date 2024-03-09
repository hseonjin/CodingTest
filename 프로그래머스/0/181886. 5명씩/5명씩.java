import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<names.length; i+=5) {
            arr.add(names[i]);
        }
        String[] result = arr.toArray(new String[0]);
        return result;
    }
}