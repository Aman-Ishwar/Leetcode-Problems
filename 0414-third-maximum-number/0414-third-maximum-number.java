class Solution {
    public int thirdMax(int[] nums) {
        long fis_max=nums[0];
        long sec_max=Long.MIN_VALUE;
        long third_max=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if (nums[i] == fis_max || nums[i] == sec_max || nums[i] == third_max) {
                    continue;
                    }
            
            if(nums[i]>fis_max){
                third_max=sec_max;
                sec_max=fis_max;
                fis_max=nums[i];
            }
            else if(nums[i]>sec_max){
                third_max=sec_max;
                sec_max=nums[i];
            }
            else if(nums[i]>third_max){
                third_max=nums[i];
            }
        }
        if(third_max==Long.MIN_VALUE){
            return (int)fis_max;
        }
        return (int) third_max;

    }
}