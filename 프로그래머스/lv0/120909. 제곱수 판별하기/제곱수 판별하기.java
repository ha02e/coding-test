class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        
        if(count%2==0){
            answer=2;
        }else{
            answer=1;
        }
        
        return answer;
    }
}