class Solution {
    public boolean search(int[] nums, int target) {
        for(int elem:nums){
            if(target==elem){
                return true;
            }
        }
        return false;
    }
}