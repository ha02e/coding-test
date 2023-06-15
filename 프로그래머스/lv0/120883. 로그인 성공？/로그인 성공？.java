class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])){  //아이디가 같고, 비번도 같을 경우
                    answer="login";
                    break;
                }else{  //아이디가 같고, 비번이 다를 경우
                    answer="wrong pw";
                    break;
                }
            }else{
                answer="fail";
            }
        }
        return answer;
    }
}