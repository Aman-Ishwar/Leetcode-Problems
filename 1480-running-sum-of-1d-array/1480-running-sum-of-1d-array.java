class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int sum=0;
        int [] ans = new int[n];
        for(int i =0;i<n;i++){
            ans[i]=sum+nums[i];
            sum=ans[i];
        }
        return ans;
    }
}