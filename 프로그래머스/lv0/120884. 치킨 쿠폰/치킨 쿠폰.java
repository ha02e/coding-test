class Solution {
    public int solution(int chicken) {
        int answer = -1;
        
        if(chicken>=10){
            answer=((chicken-10)/9)+1;
        }else{
            answer=0;
        }
        
        return answer;
    }
}