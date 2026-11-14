class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int frq=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                if(frq==0){
                    frq=arr[i];
                }
                else if(frq!=arr[i]) {
                    return false;
                }


            }
        }
        return true;
    }
}