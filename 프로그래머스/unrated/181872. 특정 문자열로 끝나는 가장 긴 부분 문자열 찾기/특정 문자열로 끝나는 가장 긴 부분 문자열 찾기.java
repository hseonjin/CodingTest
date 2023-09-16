class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat); 
        // pat 문자열이 나오는 마지막 인덱스 얻기
        
        idx += pat.length(); 
        // pat 길이만큼 더해 원하는 결과값의 인덱스 만들기
        
        return myString.substring(0, idx);
    }
}