class Solution {
    public int[] solution(int n) {
        
        //배열의 길이(약수의 개수) 구하기
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        int j=0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[j]=i;
                j++;
            }
        }
        
        return answer;
    }
}