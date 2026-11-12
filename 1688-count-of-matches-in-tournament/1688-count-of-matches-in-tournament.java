class Solution {
    public int numberOfMatches(int n) {
        int mp=0;
        while(n!=1){
            if(n%2!=0){
              mp+=(n-1)/2;
              n=(n+1)/2;  
            }
            else if(n%2==0){
                mp+=n/2;
                n=n/2;
            }
        }
        return mp;
    }
}