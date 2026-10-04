class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] de_code=new int[encoded.length+1];
        de_code[0]=first;
        for(int i=1;i<de_code.length;i++){
            de_code[i]=de_code[i-1]^encoded[i-1];
        }
        return de_code;
    }
}