import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str=String.valueOf(n);
        
        //문자열을 문자 배열로 변환
        char[] chars=str.toCharArray();
        
        //배열 오름차순 졍렬
        Arrays.sort(chars);
        
        //역순으로 조합
        StringBuffer sb=new StringBuffer();
        for(int i=chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        
        //long타입으로 변환
        answer=Long.parseLong(sb.toString());
        
        return answer;
    }
}