class Solution {
    public boolean isPerfectSquare(int num) {
        if(num%10==2||num%10==3||num%10==7||num%10==8){
            return false;
        }
        long low=0;
        long high=num;
        while(low<=high){
           long  mid=low+(high-low)/2;
            long sqr=mid*mid;
            if(sqr==num){
                return true;
            }
            else if(sqr<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return false;
    }
}