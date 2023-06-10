import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> lists=new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                        n/=i;
                }
                lists.add(i);
            }
        }
        
        int[] answer=new int[lists.size()];
        for(int i=0; i<lists.size(); i++){
            answer[i]=lists.get(i);
        }
        
        return answer;
    }
}