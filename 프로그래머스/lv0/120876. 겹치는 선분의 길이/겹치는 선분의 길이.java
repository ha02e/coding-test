class Solution {
    public int solution(int[][] lines) {
        //1.arr 배열 및 변수 초기화
        int answer = 0;
        int[] arr=new int[200];
        
        //2.lines 정보를 arr 배열에 적용
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){ //음수일 수 있어서, +100을 해주어 치환
                arr[j]++;
            }
        }
        
        //3.arr 배열에서 겹친 부분 카운트
        for(int i=0; i<200; i++){
            if(arr[i] >1){
                answer++;
            }
        }
        return answer;
    }
}