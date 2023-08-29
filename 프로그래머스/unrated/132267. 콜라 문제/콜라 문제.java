class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            if(n<a){
                break;
            }else{
                answer+=(n/a)*b;
                int remain=n%a;
                n=((n/a)*b)+remain;
            }
        }
        
        return answer;
    }
}