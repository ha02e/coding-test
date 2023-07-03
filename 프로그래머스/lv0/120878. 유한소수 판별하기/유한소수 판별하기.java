class Solution {
    public int solution(int a, int b) {
        int bottom = b/gcd(a,b);
        
        while(bottom!=1){
            if(bottom%2==0){
                bottom/=2;
            }else if(bottom%5==0){
                bottom/=5;
            }else{
                return 2;
            }
        }
        return 1;
    }
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,(a%b));
        }
    }
}