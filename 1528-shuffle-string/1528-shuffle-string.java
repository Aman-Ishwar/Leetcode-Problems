class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch =new char[indices.length];
        // char [] temp=new char(s);
        char[] temp = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            ch[indices[i]]=temp[i];
        }
        s=new String(ch);
        return s;
    }
}