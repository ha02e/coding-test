class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] arr_s=my_string.toCharArray();
        
        arr_s[num1]=my_string.charAt(num2);
        arr_s[num2]=my_string.charAt(num1);
        
        answer=String.valueOf(arr_s);
        return answer;
    }
}