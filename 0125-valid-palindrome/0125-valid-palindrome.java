class Solution {
    public boolean isPalindrome(String s) {
        // String non_alphachar[]={" ", "," ,"@",":",";","#" }
        // String Character.isLetterOrDigit(s.charAt(left))
        // String ans=s.replaceALL("\\s+","",",",":");
        int low=0;
        int end=s.length()-1;
        while(low<end){
            if(!Character.isLetterOrDigit(s.charAt(low))){
                low++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else{
                if(Character.toLowerCase(s.charAt(low))!=Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                low++;
                end--;
            }
        }
        return true;
    }
}