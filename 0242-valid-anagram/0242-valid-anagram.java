class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char [] t_arr=t.toCharArray();
        char[]s_arr=s.toCharArray();
        Arrays.sort(s_arr);
         Arrays.sort(t_arr);
         return Arrays.equals(s_arr,t_arr);
    }
}