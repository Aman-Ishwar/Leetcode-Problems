class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] arr=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            int index=sentence.charAt(i)-'a';
            arr[index]=true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=true){
                return false;
            }
        }
        return true;

    }
}