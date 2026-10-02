class Solution {
    public int missingNumber(int[] nums) {
        // int result[]=Arrays.sort(nums);
        Arrays.sort(nums);
        // int ans[]=new int [nums.length+1];
        // int low=0;
        // int high=low+1;
        if(nums[0]!=0){
            return 0;
        }
        for(int low=0;low<nums.length-1;low++){
            int high=low+1;
            if((nums[low]+1)!=nums[high]){
                return high;
            }
        }
        return nums.length;
    }
}