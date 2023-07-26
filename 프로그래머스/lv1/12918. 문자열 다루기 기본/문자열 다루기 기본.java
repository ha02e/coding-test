class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6){
            int cnt=0;
            
            for(int i=0; i<s.length(); i++){
                char ch=s.charAt(i);
                if(48<=ch && ch<=57){
                    cnt++;
                }
            }
            if(cnt==s.length()){
                answer=true;
            }else{
                answer=false;
            }
        }else{
            answer=false;
        }
        
        return answer;
    }
}