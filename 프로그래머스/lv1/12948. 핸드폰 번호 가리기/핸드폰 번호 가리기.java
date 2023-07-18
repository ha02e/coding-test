class Solution {
    public String solution(String phone_number) {
        //phone_number를 두 부분으로 나누어준다.
        String front = phone_number.substring(0,phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4,phone_number.length());
        
        //front 부분을 *으로 치환한다.
        front=front.replaceAll("\\d","*");
        
        String answer = front+back;
        return answer;
    }
}