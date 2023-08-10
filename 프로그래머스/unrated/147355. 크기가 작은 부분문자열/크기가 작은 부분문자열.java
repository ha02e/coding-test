class Solution {
    public int solution(String t, String p) {
        int answer=0;
        long pNum=Long.parseLong(p);
        
        //t의 길이 부분 문자열
        for(int i=0; i<=t.length()-p.length(); i++){
            long str=Long.parseLong(t.substring(i,i+p.length()));
            if(str<=pNum){
                answer++;   
            }
        }
        
        return answer;
    }
}