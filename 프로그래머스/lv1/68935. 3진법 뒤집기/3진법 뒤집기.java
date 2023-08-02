class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n을 3진법으로 변환
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        //3진법으로 변환한 n을 뒤집기
        String n_reverse = sb.reverse().toString();
        
        int power=1;
        
        //3진법을 10진법으로 변환
        for (int i = 0; i < n_reverse.length(); i++) {
            int digit = n_reverse.charAt(i) - '0'; // 문자를 숫자로 변환
            answer += digit * power; // 3의 제곱수로 곱한 후 누적 덧셈
            power *= 3;  // 3의 제곱수를 계산하기 위해 3을 곱함
        }
        
        return answer;
    }
}