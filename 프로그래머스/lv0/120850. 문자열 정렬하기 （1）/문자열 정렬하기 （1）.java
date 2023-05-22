import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        //문자열 중에 숫자만 뽑아오기
        char[] str_arr=my_string.toCharArray();
        String num="";
        
        for(int i=0;i<str_arr.length;i++){
            if(str_arr[i]>=48 && str_arr[i]<=57){
                num+=str_arr[i]+"";
            }
        }
        
        //숫자 오름차순 정렬하기
        char[] num_arr=num.toCharArray();
        int[] answer=new int[num_arr.length];
        
        for(int i=0;i<num_arr.length;i++){
            answer[i]=Integer.parseInt(String.valueOf(num_arr[i]));
        }
        Arrays.sort(answer);
        
        return answer;
    }
}