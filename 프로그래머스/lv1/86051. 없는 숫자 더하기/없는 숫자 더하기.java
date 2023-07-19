class Solution {
    public int solution(int[] numbers) {
        int total=0;
        for(int i=0; i<=9; i++){
            total+=i;
        }
        
        int answer = total;
        
        for(int i=0;i<numbers.length;i++){
            answer-=numbers[i];
        }
        
        return answer;
    }
}