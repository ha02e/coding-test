class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] num={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<num.length; i++){
            if(s.contains(num[i])){
                s=s.replace(num[i], Integer.toString(i));
            }
        }
        
        answer=Integer.parseInt(s);
        return answer;
    }
}