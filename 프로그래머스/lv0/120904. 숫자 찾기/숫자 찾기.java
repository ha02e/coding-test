class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String num_s=Integer.toString(num);
        
        char[] num_arr=num_s.toCharArray();
        for(int i=0; i<num_arr.length; i++){
            if(num_arr[i]==Character.forDigit(k,10)){
                answer=i+1;
                break;
            }else{
                answer=-1;
            }
        }
        
        return answer;
    }
}