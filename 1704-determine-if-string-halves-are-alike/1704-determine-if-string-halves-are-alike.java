class Solution {
    public int counting_vowels(String s1,int start,int end){
        int count=0;
        for(int i=start;i<end;i++){
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int a=counting_vowels(s,0,(s.length()/2));
        int b=counting_vowels(s,(s.length()/2),s.length());
        

        if(a==b){
            return true;

        }
        return false;
    }
}