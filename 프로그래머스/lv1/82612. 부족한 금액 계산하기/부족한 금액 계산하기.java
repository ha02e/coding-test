class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long price_total=0;

        for(int i=1; i<=count; i++){
            price_total+=price*i;
        }
        
        if(price_total>money){
            answer=price_total-money;
        }else{
            answer=0;
        }
        
        return answer;
    }
}