class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            StringBuffer sb = new StringBuffer();
            sb.append(a);

            int len = sb.length();

            for (int b = 0; b < len; b++) {
                if ((sb.charAt(b) - '0') == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}