class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length == arr2.length){
            int sum1 = 0; 
            int sum2 = 0; 
            
            for (int num : arr1) {
                sum1 += num;
            }

            // arr2의 원소들의 합 계산
            for (int num : arr2) {
                sum2 += num;
            }
            
            if(sum1 < sum2){
                answer = -1;
            }else if(sum1 > sum2){
                answer = 1;
            }else{
                answer = 0;
            }
        }else if(arr1.length < arr2.length){
            answer = -1;
        }else{
            answer = 1;
        }
        
        return answer;
    }
}