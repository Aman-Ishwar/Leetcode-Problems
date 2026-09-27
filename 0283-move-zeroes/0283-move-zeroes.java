class Solution {
    public void moveZeroes(int[] nums) {
        int low=0,temp;
        for(int high=0;high<nums.length;high++){
            if(nums[high]!=0){
                temp=nums[high];
                nums[high]=nums[low];
                nums[low]=temp;
                low++;
            }
        }
        
    }
}