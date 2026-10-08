class Solution {
    public boolean isPowerOfFour(int n) {
        int count=0;
        int temp=n;
        if(n<=0){
            return false;
        }
        while(temp!=0){
            if((temp&1)==0){
                count++;
            }
            temp=temp>>1;
        }
        // return ((count%2==0)&&(n&(n-1)==0));
         return (count % 2 == 0) && ((n & (n - 1)) == 0);
    }
}