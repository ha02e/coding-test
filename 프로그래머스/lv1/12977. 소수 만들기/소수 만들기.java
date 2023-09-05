import java.util.ArrayList;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;
		
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        
        // for문을 이용하여 배열의 합을 구한다.         
        for(int i = 0; i < nums.length; i++) {
        	if(i + 2 >= nums.length) break;
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int k = j + 1; k < nums.length; k++) {
        			sumList.add(nums[i] + nums[j] + nums[k]);
        		}
        	}
        }
        
        // 소수 판별
        for(Integer i : sumList) {
        	int count = 2;
        	answer++;
        	while(count < i) {			
                if(i % count == 0) {
                    answer--;
                    break;
                }
                count++;
        	}
        }
        return answer;
    }
}