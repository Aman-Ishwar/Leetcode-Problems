class Solution {
    public boolean isPerfectSquare(int num) {
        if(num%10==2||num%10==3||num%10==7||num%10==8){
            return false;
        }
        for(long i=0;i*i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}