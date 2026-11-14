class Solution {
    public boolean check_pl(String s ){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==(s.charAt(end))){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }


    public String firstPalindrome(String[] words) {
        String x="";


        for(int i=0;i<words.length;i++){
            boolean ch=check_pl(words[i]);
            if(ch){
                x+=words[i];
                return x;
            }
            // return x;
        }
        return x;
    }
}