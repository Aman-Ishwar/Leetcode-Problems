class Solution {
     static int gcd(int x,int y){
            while(y!=0){
                int rem=x%y;
                x=y;
                y=rem;
            }
            return x;
        }
    public String gcdOfStrings(String str1, String str2) {
        String ans="";
        if(!(str1+str2).equals(str2+str1)){
            return ans;
        }
        else{
            int x=gcd(str1.length(),str2.length());
            ans=str1.substring(0,x);
        }
        return ans;
    }
}