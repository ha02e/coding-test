class Solution {
    public int[] solution(int n, int[] numlist) {
        int x=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                x++;
            }
        }
        
        int y=0;
        int[] answer=new int[x];
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[y]=numlist[i];
                y++;
            }
        }
        return answer;
    }
}