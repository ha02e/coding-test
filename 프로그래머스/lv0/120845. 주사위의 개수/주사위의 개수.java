class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width=0;
        int length=0;
        int height=0;
        
        width=box[0]/n;
        length=box[1]/n;
        height=box[2]/n;
        
        answer=width*length*height;
        
        return answer;
    }
}