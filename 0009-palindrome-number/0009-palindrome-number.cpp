class Solution {
public:
    
    bool isPalindrome(int x) {
        long long rev =0,temp;
       int org=x;
       if(x<0){
        return 0;       }
        while(x>0){
            temp=x%10;
            rev = rev*10+temp;
            x/=10;
        }
        return org==rev;
    }
};