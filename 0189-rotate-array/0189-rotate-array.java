class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int []arr=new int[k];
        for(int i=nums.length-k;i<nums.length;i++){
            arr[i-(nums.length-k)]=nums[i];
        }
        // shifting
        for(int i=nums.length-1-k;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        // return nums;
    }
}