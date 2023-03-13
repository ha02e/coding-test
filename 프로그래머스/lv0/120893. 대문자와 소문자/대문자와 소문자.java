class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] strs=my_string.toCharArray();
        
        String text="";
        for(int i=0; i<strs.length; i++){
            if(strs[i]>='a' && strs[i]<='z'){
                text=strs[i]+"";
                answer+=text.toUpperCase();
            }else if(strs[i]>='A' && strs[i]<='Z'){
                text=strs[i]+"";
                answer+=text.toLowerCase();
            }
        }
        
        return answer;
    }
}