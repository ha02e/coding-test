class Solution {
    public int solution(int num) {
        long number=num;
        int answer=0;
        
        if(number==1){
            return 0;
        }else{
            while(number!=1){
                if(number%2==0){  //입력된 수가 짝수라면
                    number=number/2;
                }else{
                    number=(number*3)+1;
                }
                answer++;
            
                if (answer >= 500) {  // 500번 반복할 때까지 1이 되지 않는 경우
                    return -1;
                }
            }
        }
        
        return answer;
    }
}