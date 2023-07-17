import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        //나누어 떨어지는 숫자가 있을 경우
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                temp.add(arr[i]);
            }
        }
        
        //나누어 떨어지는 숫자가 없을 경우
        if(temp.isEmpty()){
            temp.add(-1);
        }
        
        //ArrayList를 int 배열로 변환
        int[] answer=new int[temp.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=temp.get(i);
        }
        
        return answer;
    }
}