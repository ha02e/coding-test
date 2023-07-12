import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str_n=String.valueOf(n);
        int[] answer = new int[str_n.length()];
        
        for(int i=0; i<answer.length; i++){
            String str=str_n.substring(answer.length-1-i, answer.length-i);
            answer[i]=Integer.parseInt(str);
        }
        
        return answer;
    }
}