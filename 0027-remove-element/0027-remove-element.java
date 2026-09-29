class Solution {
    public int removeElement(int[] nums, int val) {
        // Arrays.sort(nums);
       int  k=nums.length;
       int j=0;
       int []expectedNums=new int[k];
        for(int i =0;i<nums.length;i++){
            if(nums[i]==val){
              k--;
            }
           else{
             expectedNums[j++]=nums[i];
           }
        }
        for(int i=0;i<k;i++){
            nums[i]=expectedNums[i];
        }
        return k;
    }
}