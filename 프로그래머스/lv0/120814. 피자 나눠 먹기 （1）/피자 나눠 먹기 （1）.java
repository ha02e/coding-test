class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=15;i++){
            if(7*(i-1)<n && n<=7*i){
                answer=i;
            }
        }
        return answer;
    }
}