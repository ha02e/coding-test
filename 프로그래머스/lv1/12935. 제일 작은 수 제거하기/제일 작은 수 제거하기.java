import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }        
        
        int[] answer = new int[arr.length-1];
        int[] copy = arr.clone();
        
        Arrays.sort(copy);
        
        int idx=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==copy[0]){
                continue;
            }else{
                answer[idx++]=arr[i];
            }
        }
        
        return answer;
    }
}