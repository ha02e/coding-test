import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String new_s=String.valueOf(arr);
        
        StringBuffer sb=new StringBuffer(new_s);
        answer=sb.reverse().toString();
        return answer;
    }
}