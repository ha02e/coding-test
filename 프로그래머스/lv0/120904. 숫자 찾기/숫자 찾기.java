class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String num_s=Integer.toString(num);
        char k_s=(char)(k+'0');
        
        char[] num_arr=num_s.toCharArray();
        for(int i=0; i<num_arr.length; i++){
            if(num_arr[i]==k_s){
                answer=i+1;
                break;
            }else{
                answer=-1;
            }
        }
        
        return answer;
    }
}