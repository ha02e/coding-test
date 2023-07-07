class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntP=0;
        int cntY=0;

        String[] arr=s.split("");
        for(int i=0; i<s.length(); i++){
            if(arr[i].equals("p") || arr[i].equals("P")){
                cntP++;
            }else if(arr[i].equals("y") || arr[i].equals("Y")){
                cntY++;
            }
        }
        
        if(cntP==0 && cntY==0){
            answer= true;
        }else if(cntP==cntY){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}