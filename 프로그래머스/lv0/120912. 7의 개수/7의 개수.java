class Solution {
    public int solution(int[] array) {
        int answer = 0;
       
        for(int i=0; i<array.length; i++){
            String num_s=String.valueOf(array[i]);
            String[] num_arr=num_s.split("");
            
            for(int j=0; j<num_arr.length; j++){
                if(num_arr[j].equals("7")){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}