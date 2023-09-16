class Solution {
    public String solution(String my_string, int s, int e) {
        String reStr = my_string.substring(s, e+1); // 뒤집어야하는 문자열 추출
        StringBuffer sb = new StringBuffer(reStr).reverse(); // StringBuffer 메소드 이용할거임

        my_string = my_string.replaceAll(reStr, sb.toString()); // reStr을 sb로 모두 바꾸겠다
        return my_string;
    }
}