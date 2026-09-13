class Solution {
    public int findNumbers(int[] nums) {
        int temp,array_counter=0;
        for(int i=0;i<nums.length;i++){
            int each_element_digit_count=0;
            while (nums[i]>0){
                temp=nums[i]%10;
                nums[i]/=10;
                each_element_digit_count++;
            }
            if(each_element_digit_count%2==0){
                array_counter++;
            }
        }
    return array_counter;
    }
}